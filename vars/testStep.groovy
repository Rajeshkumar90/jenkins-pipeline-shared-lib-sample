def checkout(Map pipelineParams)
{
println "Checkout Git"
  git branch: pipelineParams.branchName, url: pipelineParams.giturl
}
