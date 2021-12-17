#!/bin/sh
# ref: https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/
#
# Usage example: /bin/bash git_push_msx.sh java-msx-sdk v1.0.0  `cat ~/.ssh/personal_access_token`

# git_user_id=$1
# git_repo_id=$2
msx_sdk=$1
release_tag=$2
git_token=$3

git_repo="https://oauth2:$git_token@cto-github.cisco.com/mtsizis/$msx_sdk.git"

# if [ "$git_host" = "" ]; then
#     git_host="github.com"
#     echo "[INFO] No command line input provided. Set \$git_host to $git_host"
# fi

# if [ "$git_user_id" = "" ]; then
#     git_user_id="GIT_USER_ID"
#     echo "[INFO] No command line input provided. Set \$git_user_id to $git_user_id"
# fi

# if [ "$git_repo_id" = "" ]; then
#     git_repo_id="GIT_REPO_ID"
#     echo "[INFO] No command line input provided. Set \$git_repo_id to $git_repo_id"
# fi

if [ "$release_tag" = "" ]; then
    # release_tag="Minor update"
    echo "[INFO] No command line input provided. Set \$release_tag to $release_tag"
    exit
fi

if [ "$git_token" = "" ]; then
    # release_tag="Minor update"
    echo "[INFO] No command line input provided. Set \$release_tag to $release_tag"
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

    # if [ "$GIT_TOKEN" = "" ]; then
    #     echo "[INFO] \$GIT_TOKEN (environment variable) is not set. Using the git credential in your environment."
    #     git remote add origin https://${git_host}/${git_user_id}/${git_repo_id}.git
    # else
    #     git remote add origin https://${git_user_id}:${GIT_TOKEN}@${git_host}/${git_user_id}/${git_repo_id}.git
    # fi

    echo "[INFO] Git remote is not set. Calling git remote add origin $git_repo"
    git remote add origin $git_repo # https://oauth2:$1@cto-github.cisco.com/mtsizis/$msx_sdk.git
fi

# git clone https://oauth2:$1@cto-github.cisco.com/NFV-BU/msx-platform-sdk-regression

# if [ "$git_remote" = "" ]; then # git remote not defined

#     if [ "$GIT_TOKEN" = "" ]; then
#         echo "[INFO] \$GIT_TOKEN (environment variable) is not set. Using the git credential in your environment."
#         git remote add origin https://${git_host}/${git_user_id}/${git_repo_id}.git
#     else
#         git remote add origin https://${git_user_id}:${GIT_TOKEN}@${git_host}/${git_user_id}/${git_repo_id}.git
#     fi

# fi


git pull origin main

# Pushes (Forces) the changes in the local repository up to the remote repository
echo "Git pushing to main"
git push origin main 2>&1 | grep -v 'To https'

git tag -a $release_tag -m $release_tag
git push --tags
