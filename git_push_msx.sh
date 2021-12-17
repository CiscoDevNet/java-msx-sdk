#!/bin/sh
# ref: https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/
#
# Usage example: /bin/bash git_push_msx.sh java-msx-sdk v1.0.0  `cat ~/.ssh/personal_access_token`

msx_sdk=$1
release_tag=$2
git_token=$3

git_repo="https://oauth2:$git_token@github.com/CiscoDevNet/$msx_sdk.git"

if [ "$release_tag" = "" ]; then
    echo "[INFO] No command line input provided. Set \$release_tag to $release_tag"
    exit
fi

if [ "$git_token" = "" ]; then
    echo "[INFO] No command line input provided. Set \$git_token to $git_token"
    exit
fi

# Initialize the local directory as a Git repository
git init

# Adds the files in the local repository and stages them for commit.
git add .

# Commits the tracked changes and prepares them to be pushed to a remote repository.
git commit -m "$release_tag"

# Sets the new remote
git_remote=`git remote`

if [ "$git_remote" = "" ]; then # git remote not defined
    echo "[INFO] Git remote is not set. Calling git remote add origin $git_repo"
    git remote add origin $git_repo # https://oauth2:$1@cto-github.cisco.com/mtsizis/$msx_sdk.git
fi

git pull origin main

# Pushes (Forces) the changes in the local repository up to the remote repository
echo "Git pushing to main"
git push origin main 2>&1 | grep -v 'To https'

git tag -a $release_tag -m $release_tag
git push --tags
