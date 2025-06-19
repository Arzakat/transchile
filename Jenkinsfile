pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10' //mío: 3.9.10 original: 3.8.6
        jdk 'JDK21' //mío: JDK21 original: JDK21
    }
    stages {
        stage('Checkout código') {
            steps {
                checkout scm
            }
        }
        stage('Compilar') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                bat 'mvn package'
            }
        }
    }
    post {
        success {
            echo " El build fue exitoso"
        }
        failure {
            echo " El build falló"
        }
    }
}