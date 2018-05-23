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
		

}
}
}
