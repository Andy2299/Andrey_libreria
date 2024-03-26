// vars/sonarAnalysis.groovy

def call(Boolean abortOnFailure = false, Boolean abortPipeline = false) {
    echo 'Ejecución de las pruebas de calidad de código...'
    // Simula una ejecución de SonarQube; reemplazar con lógica real según sea necesario
    sh 'echo "Simulación de SonarQube ejecutándose"'

    // Simula la lógica para decidir si el pipeline debe abortarse
    if (abortOnFailure || abortPipeline) {
        error 'Quality Gate fallido. Abortando pipeline...'
    }
}
