package org
import org.*

/*def work(int x,int y){ 
    def myUtils = new org.validAdd()
    def tes=myUtils.add(x,y)
    return tes
}*/
def work(Map pipelineParams){ 
    def myUtils = new org.validAdd()
    def tes=myUtils.add(pipelineParams.x,pipelineParams.y)
    return tes
}
def check(Map pipelineParams)
{
println "Checkout Git"
myUtils = new org.validAdd()
myUtils.checkout(this,pipelineParams.branchName, pipelineParams.giturl)
//git branch: pipelineParams.branchName, url: pipelineParams.giturl
}
