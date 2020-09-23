def checkout(Map pipelineParams)
{
println "Checkout Git"
  git branch: pipelineParams.branchName, url: pipelineParams.giturl
}
def call(body) {
    echo "Start Deploy"

    new Sample(script:this).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
