#!/bin/sh
#
# Usage example: /bin/bash git_push_sdk.sh java-msx-sdk v1.0.0 `cat ~/.ssh/personal_access_token`

msx_sdk=$1
release_tag=$2
# git_token=$3

# git_repo="https://oauth2:$git_token@github.com/CiscoDevNet/$msx_sdk.git"

# Debugging repo
# git_repo="https://oauth2:$git_token@cto-github.cisco.com/mtsizis/$msx_sdk.git"


if [ "$release_tag" = "" ]; then
    echo "[INFO] No command line input provided. Set \$release_tag to $release_tag"
    exit
fi

# if [ "$git_token" = "" ]; then
#     echo "[INFO] No command line input provided. Set \$git_token to $git_token"
#     exit
# fi

# Adds the files in the local repository and stages them for commit.
git add .

# Commits the tracked changes and prepares them to be pushed to a remote repository.
git commit -m "$release_tag"

# Pushes (Forces) the changes in the local repository up to the remote repository
echo "Git pushing $msx_sdk to main"
git push origin main -v 
# 2>&1 | grep -v 'To https'

git tag -a $release_tag -m $release_tag
git push --tags
