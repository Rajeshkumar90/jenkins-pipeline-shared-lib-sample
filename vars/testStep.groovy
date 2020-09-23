def checkout(Map pipelineParams)
{
println "Checkout Git"
  git branch: pipelineParams.branchName, url: pipelineParams.giturl
}
def caller(body) {
    echo "Start Deploy"

    new Sample().run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
