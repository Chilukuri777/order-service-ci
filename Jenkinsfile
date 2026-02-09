pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Clean & Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package Jar') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }


    }

    post {
        failure {
            echo 'Pipeline Failed ❌'
        }
        success {
            echo 'Pipeline Passed ✅'
        }
    }
}
