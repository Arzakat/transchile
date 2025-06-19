pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10'
        jdk 'JDK21'
    }
    stages {
        stage('Checkout código') {
            steps {
                checkout scm
            }
        }
        stage('Análisis de Dependencias') {
            steps {
                bat 'if not exist "dependency-check-report" mkdir "dependency-check-report"'
                //tool 'mi-primer-dependency-check'
                dependencyCheck(
                    odcInstallation: 'mi-primer-dependency-check',
                    additionalArguments: '--project "transchile" --scan "." --format HTML --format XML --out "./dependency-check-report" --enableExperimental --nodeAuditSkipDevDependencies false'
                )
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
        stage('Despliegue') {
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