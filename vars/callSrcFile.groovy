package org
import org.*

def work(int x,int y){ 
    def myUtils = new org.validAdd()
    def tes=myUtils.add(x,y)
    return tes
}
def check(Map pipelineParams)
{
println "Checkout Git"
myUtils = new org.validAdd()
myUtils.checkout(pipelineParams.branchName, pipelineParams.giturl)
//git branch: pipelineParams.branchName, url: pipelineParams.giturl
}
