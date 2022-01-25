pipeline {
    agent any 
    tools {
        maven "maven383"
        
    }
    
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                }
        
        }
        stage('Build') {
            steps {
                sh 'mvn package'
                }
            
        }
        
     }
    post {
        success {
                    junit '**/target/*-reports/*.xml'
                    
                    
                }
       always {
          junit(
        allowEmptyResults: true,
        testResults: '**/target/surefire-reports/.xml'
      )
      }
   } 

}