package org
def add(int x,int y)
{
int z= x+y
return z
}
def checkout(Map pipelineParams)
{
println "Checkout Git"
  git branch: pipelineParams.branchName, url: pipelineParams.giturl
}
