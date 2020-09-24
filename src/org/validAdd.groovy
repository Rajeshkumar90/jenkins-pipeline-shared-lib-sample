package org

class validAdd{
def add(int x,int y)
{
int z= x+y
return z
}
def checkout(xyz,String branchName,String giturl)
{
println "Checkout Git"
xyz.git branch: branchName, url: giturl
}
return this
}


