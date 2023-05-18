def call(git_branch, git_url ){
   echo 'cloning..'
    git branch: '${git_branch}', url: '${git_url}'
  }
