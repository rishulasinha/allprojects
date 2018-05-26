#!groovy
pipeline
{
agent 
{
	label "master"
	
}
tools {
		maven 'Maven3.1.1'
		jdk 'java8'
		}
		
		stages
		{
			stage('Intialize'){
			steps{
			bat '''
			echo "M2_HOME = %M2_HOME%"
			'''
					
			}
		}
		
		stage('Build'){
		steps
		{
		bat ' cd Employee & mvn package'
		}
		
		post {
		success {
		
		junit 'Employee/target/surefire-reports/*.xml'
		
		}
		
		}
			stage('emailNotification'){
		    steps{
			    emailext ( 
		       subject: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'", 
		       body: """<p>STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
			 <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
		       to: "rishulasinha13@gmail.com,badal.singh2432@gmail.com"
		     )
}
		

}
}
}
