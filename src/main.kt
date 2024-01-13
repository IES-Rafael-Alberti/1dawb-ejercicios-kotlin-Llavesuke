
fun lineaALinea(arte: List<String>,consejo:String) {
    println("**********************************")
    println("$consejo")
    println("**********************************")
    for (linea in arte) {
        println(linea)
        Thread.sleep(300)
    }
}
fun pantallaDeCarga() {
    val Doraemon = listOf("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀⠀⠀⠀ " ,
            "⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄⠀⠀⠀ " ,
            "⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀ " ,
            "⠀⠀⠀⠀⠀⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄ " ,
            "⠀⠀⠀⠀⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇ " ,
            "⠀⠀⠀⠀⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷ " ,
            "⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃ " ,
            "⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀ " ,
            "⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀ " ,
            "⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁")
    val amogus: List<String> = listOf("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀",
        "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀" ,
        "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀" ,
        "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀" ,
        "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀" ,
        "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀" ,
        "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀" ,
        "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀" ,
        "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀" ,
        "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀" ,
        "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀" ,
        "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀" ,
        "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀" ,
        "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀" ,
        "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀" ,
        "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀" ,
        "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀" ,
        "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀" ,
        "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    val calamardo: List<String> = listOf("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠤⠲⠦⠉⠉⠉⠏⠉⠒⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠲⠃⢀⣤⠀⠀⠀⠲⠂⠀⠠⠆⠀⠙⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡔⠁⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⢀⠊⠁⠀⢁⡴⠚⠉⣉⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠠⠤⠔⠒⡄⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⡆⢰⠆⠀⠋⣠⠔⠉⠁⣀⡠⠄⠒⠂⠀⠀⠀⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠔⠊⠁⠀⠀⠀⠀⠀⣠⡴⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⢠⡆⠀⠀⠀⡜⠁⣠⠔⠋⢁⡔⠒⠒⠤⡀⠀⠀⠀⠀⡐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⢀⣀⣤⣶⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⡆⡶⠀⠀⢀⡜⠁⢀⣀⢸⠀⠀⠀⠀⠈⢆⠀⠀⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠤⠊⠁⠀⢀⡀⣴⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠰⡀⠀⠀⠘⠀⡞⠁⠀⠉⢇⠀⣿⣄⠀⠈⡆⠀⠕⠒⠉⣉⡒⡄⠀⠀⠀⠀⢀⠤⠊⠁⢀⡠⠔⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠑⢄⡀⠀⠀⢇⠀⣤⡄⠈⢢⡈⠻⡖⢀⡞⣀⠔⠊⠁⠀⠀⠉⠐⠒⠠⢎⢁⡠⠔⠂⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⢂⠘⢿⣦⡇⠉⠓⢶⡫⠞⠁⣀⣤⣤⣤⣤⣤⣤⣤⠴⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢡⠦⠭⡇⠀⡠⠊⠀⣠⣮⣬⣿⣿⣿⣿⣿⣯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠁⢀⠔⡧⠊⠀⢀⡜⠁⠙⣿⣿⣿⡿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣀⣡⠎⠀⠀⢠⠊⠀⠀⠀⣸⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⣰⣧⣀⣀⡠⣴⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⣤⣤⣾⡿⠿⠋⠁⠀⢹⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠿⠛⠛⠛⠛⠻⢿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ,
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠁⡰⢤⣀⣀⡄⢠⠞⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("CARGANDO EL MEJOR MENU DE TODOS LOS TIEMPOS, DISFRUTE DE LA ESPERA")

    lineaALinea(Doraemon,"Puedes ejecutar tu programa usando el boton de play arriba a la derecha de Intellij")
    lineaALinea(amogus, "¿Sabias que para escribir una linea puedes usar el comando println()?")
    lineaALinea(calamardo, "¡No te olvides de comentar tus programas!")

}
fun unidad1() {
    println("Asi que por el principio eh")
    println("Me dispongo a listar los ejercicios a continuacion -> ")

    val ejerciciosU1 = mapOf(
        1 to ::ejercicio_4, 2 to ::ejercicio_6, 3 to ::ejercicio_12, 4 to ::ejercicio_15,
        5 to ::ejercicio_18, 6 to ::ejercicio_20, 7 to ::ejercicio_21, 8 to ::ejercicio_22,
        9 to ::ejercicio_24, 10 to ::ejercicio_25, 11 to ::ejercicio_26, 12 to ::ejercicio_27
    )

    val ejerciciosU1Nombres = mapOf(
        1 to "ejercicio_4", 2 to "ejercicio_6", 3 to "ejercicio_12", 4 to "ejercicio_15",
        5 to "ejercicio_18", 6 to "ejercicio_20", 7 to "ejercicio_21", 8 to "ejercicio_22",
        9 to "ejercicio_24", 10 to "ejercicio_25", 11 to "ejercicio_26", 12 to "ejercicio_27"
    )
    val progressBar = listOf("[","#","#","#","#","#","]")

    do {
        for ((indice, ejercicio) in ejerciciosU1Nombres) {
            println("$indice -> $ejercicio")
        }
        print("¿Cual nos llevamos entonces? (0 para salir) -> ")
        val respuesta = readln().trim().toInt()

        when {
            respuesta == 0 -> println("Volviendo al indice")
            (respuesta in 1..ejerciciosU1.size) -> {
                print("Marchando ${ejerciciosU1Nombres[respuesta]}: ")
                for (progreso in progressBar){
                    print(progreso)
                    Thread.sleep(300)
                }
                println("\n")
                ejerciciosU1[respuesta]!!.invoke()

                println("Volviendo a la eleccion de ejercicios")


            }

        }
    } while (respuesta != 0)
}

fun unidad2() {
    println("Unidad 2, buena eleccion")
    println("Me dispongo a listar los ejercicios a continuacion -> ")

    val ejerciciosU2 = mapOf(
        1 to ::ejercicio_2_1, 2 to ::ejercicio_2_3, 3 to ::ejercicio_2_6, 4 to ::ejercicio_2_8,
        5 to ::ejercicio_2_10, 6 to ::ejercicio_2_2_2, 7 to ::ejercicio_2_2_4, 8 to ::ejercicio_2_2_6,
        9 to ::ejercicio_2_2_7, 10 to ::ejercicio_2_2_8, 11 to ::ejercicio_2_2_13, 12 to ::ejercicio_2_2_15,
        13 to ::ejercicio_2_2_18, 14 to ::ejercicio_2_2_19, 15 to ::ejercicio_2_2_25, 16 to ::ejercicio_2_3_2,
        17 to ::ejercicio_2_3_3, 18 to ::ejercicio_2_3_4
    )
    val ejerciciosU2Nombres = mapOf(
        1 to "ejercicio_2_1", 2 to "ejercicio_2_3", 3 to "ejercicio_2_6", 4 to "ejercicio_2_8",
        5 to "ejercicio_2_10", 6 to "ejercicio_2_2_2", 7 to "ejercicio_2_2_4", 8 to "ejercicio_2_2_6",
        9 to "ejercicio_2_2_7", 10 to "ejercicio_2_2_8", 11 to "ejercicio_2_2_13", 12 to "ejercicio_2_2_15",
        13 to "ejercicio_2_2_18", 14 to "ejercicio_2_2_19", 15 to "ejercicio_2_2_25", 16 to "ejercicio_2_3_2",
        17 to "ejercicio_2_3_3", 18 to "ejercicio_2_3_4"
    )

    val progressBar = listOf("[","#","#","#","#","#","]")

    do {
        for ((indice, ejercicio) in ejerciciosU2Nombres) {
            println("$indice -> $ejercicio")
        }
        print("¿Cual nos llevamos entonces? (0 para salir) -> ")
        val respuesta = readln().trim().toInt()

        when {
            respuesta == 0 -> println("Volviendo al indice")
            (respuesta in 1..ejerciciosU2.size) -> {
                print("Marchando ${ejerciciosU2Nombres[respuesta]}: ")
                for (progreso in progressBar){
                    print(progreso)
                    Thread.sleep(300)
                }
                println("\n")
                ejerciciosU2[respuesta]!!.invoke()

                println("Volviendo a la eleccion de ejercicios")


            }

        }
    } while (respuesta != 0)
}

fun unidad3() {
    println("La ultima de las unidades...")
    println("Me dispongo a listar los ejercicios a continuacion -> ")

    val ejerciciosU3 = mapOf(
        1 to ::ejercicio_3_1_4, 2 to ::ejercicio_3_1_6, 3 to ::ejercicio_3_1_8,
        4 to ::ejercicio_3_1_9, 5 to ::ejercicio_3_1_10, 6 to ::ejercicio_3_1_13,
        7 to ::ejercicio_3_2_3, 8 to ::ejercicio_3_2_5, 9 to ::ejercicio_3_2_6,
        10 to ::ejercicio_3_2_8, 11 to ::ejercicio_3_2_10, 12 to ::ejercicio_3_2_11,
        13 to ::ejercicio_3_3_1, 14 to ::ejercicio_3_3_2, 15 to ::ejercicio_3_3_3,
        16 to ::ejercicio_3_3_4, 17 to ::ejercicio_3_3_5, 18 to ::ejercicio_3_3_6
    )

    val ejerciciosU3Nombres = mapOf(
        1 to "ejercicio_3_1_4", 2 to "ejercicio_3_1_6", 3 to "ejercicio_3_1_8",
        4 to "ejercicio_3_1_9", 5 to "ejercicio_3_1_10", 6 to "ejercicio_3_1_13",
        7 to "ejercicio_3_2_3", 8 to "ejercicio_3_2_5", 9 to "ejercicio_3_2_6",
        10 to "ejercicio_3_2_8", 11 to "ejercicio_3_2_10", 12 to "ejercicio_3_2_11",
        13 to "ejercicio_3_3_1", 14 to "ejercicio_3_3_2", 15 to "ejercicio_3_3_3",
        16 to "ejercicio_3_3_4", 17 to "ejercicio_3_3_5", 18 to "ejercicio_3_3_6"
    )

    val progressBar = listOf("[","#","#","#","#","#","]")

    do {
        for ((indice, ejercicio) in ejerciciosU3Nombres) {
            println("$indice -> $ejercicio")
        }
        print("¿Cual nos llevamos entonces? (0 para salir) -> ")
        val respuesta = readln().trim().toInt()

        when {
            respuesta == 0 -> println("Volviendo al indice")
            (respuesta in 1..ejerciciosU3.size) -> {
                print("Marchando ${ejerciciosU3Nombres[respuesta]}: ")
                for (progreso in progressBar){
                    print(progreso)
                    Thread.sleep(300)
                }
                println("\n")
                ejerciciosU3[respuesta]!!.invoke()

                println("Volviendo a la eleccion de ejercicios")


            }

        }
    } while (respuesta != 0)
}

fun main(){

    pantallaDeCarga()

    println("Bienvenido a los mejores ejercicios de Kotlin")
    println("----------------------------------------------")

    do {
        println("***************************************************************************")
        println("Tiene disponibles 3 unidades repletas de ejercicios listos a ser revisados")
        print("¿Que unidad revisaremos hoy Diego? (0 para salir) -> ")
        val respuesta = readln().trim().toInt()
        when (respuesta) {
            1 -> unidad1()
            2 -> unidad2()
            3 -> unidad3()
        }
    } while (respuesta != 0)

















            //ejercicio_4()
            //ejercicio_6()
            //ejercicio_12()
            //ejercicio_15()
            //ejercicio_18()
            //ejercicio_20()
            //ejercicio_21()
            //ejercicio_22()
            //ejercicio_24()
            //ejercicio_25()
            //ejercicio_26()
            //ejercicio_27()
            //ejercicio_2_1()
            //ejercicio_2_3()
            //ejercicio_2_6()
            //ejercicio_2_8()
            //ejercicio_2_10()
            //ejercicio_2_2_2()
            //ejercicio_2_2_4()
            //ejercicio_2_2_6()
            //ejercicio_2_2_7()
            //ejercicio_2_2_8()
            //ejercicio_2_2_13()
            //ejercicio_2_2_15()
            //ejercicio_2_2_18()
            //ejercicio_2_2_19()
            //ejercicio_2_2_25()
            //ejercicio_2_3_2()
            //ejercicio_2_3_3()
            //ejercicio_2_3_4()
            //ejercicio_3_1_4()
            //ejercicio_3_1_6()
            //ejercicio_3_1_8()
            //ejercicio_3_1_9()
            //ejercicio_3_1_10()
            //ejercicio_3_1_13()
            //ejercicio_3_2_3()
            //ejercicio_3_2_5()
            //ejercicio_3_2_6()
            //ejercicio_3_2_8()
            //ejercicio_3_2_10()
            //ejercicio_3_2_11()
            //ejercicio_3_3_1()
            //ejercicio_3_3_2()
            //ejercicio_3_3_3()
            //ejercicio_3_3_4()
            //ejercicio_3_3_5()
            //ejercicio_3_3_6()
}