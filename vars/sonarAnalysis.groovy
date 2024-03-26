// // vars/sonarAnalysis.groovy

// def call(Map params = [:]) {
//     Boolean abortOnFailure = params.getOrDefault('abortOnFailure', false)
//     Boolean abortPipeline = params.getOrDefault('abortPipeline', false)

//     echo 'Ejecución de las pruebas de calidad de código...'

//     // Simula una ejecución de SonarQube; reemplazar con lógica real según sea necesario
//     sh 'echo "Simulación de SonarQube ejecutándose"'

//     // Simula la lógica para decidir si el pipeline debe abortarse
//     if (abortOnFailure || abortPipeline) {
//         error 'Quality Gate fallido. Abortando pipeline...'
//     }
// }




def call(Map params = [:]) {
    // Parámetros por defecto
    Boolean abortOnFailure = params.getOrDefault('abortOnFailure', false)
    Boolean abortPipeline = params.getOrDefault('abortPipeline', false)
    
    // Obtener el nombre de la rama desde una variable de entorno o directamente del parámetro
    String branchName = params.getOrDefault('branchName', env.BRANCH_NAME ?: 'unknown')

    echo "Ejecución de las pruebas de calidad de código en la rama ${branchName}..."

    // Simula una ejecución de SonarQube; reemplazar con lógica real según sea necesario
    sh 'echo "Simulación de SonarQube ejecutándose"'

    // Lógica para decidir si el pipeline debe abortarse basada en el nombre de la rama
    if (abortPipeline || (abortOnFailure && (branchName == 'master' || branchName.startsWith('hotfix')))) {
        error 'Quality Gate fallido. Abortando pipeline...'
    }
}

