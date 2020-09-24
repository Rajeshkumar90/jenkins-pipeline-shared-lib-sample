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
callbat(xyz)  
return this
}
def callbat(var)
  {
    var.bat label: '', script: """@echo off
    echo "Hello checking bat from another function"
    """
  }
}


