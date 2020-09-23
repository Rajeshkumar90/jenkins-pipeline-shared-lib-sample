package org


def add(int x,int y)
{
int z= x+y
return z
}
def checkout(String branchName,String giturl)
{
println "Checkout Git"
git branch: branchName, url: giturl
}


