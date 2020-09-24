def call(Map pipelineParams) {
def myUtils = new org.validAdd()
    pipeline {
        agent {
		label "master"
		}
	environment{
		credID = credentials("3dcb170c-4677-411a-9720-bc20898f1b07")
		}		
        stages {
            stage('Git Checkout') {
                steps {
                    script {
                     println "Checkout Git"
						//myUtils = new org.validAdd()
						myUtils.checkout(this,pipelineParams.branchName, pipelineParams.giturl)
                    }
                }
            }
            stage('Addition') {
                steps {
                    script {
                        def tes=myUtils.add(pipelineParams.x,pipelineParams.y)
						          println "Returned :"+tes 
                    }
                }
            }
        }
    }
}
