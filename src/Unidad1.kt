import kotlin.text.replaceFirstChar as replaceFirstChar

fun ejercicio_4() {
    print("Introduce una temperatura (ºC) -> ")
    val temperatura = readln().trim().toInt()

    println("${temperatura*1.8+32}")
}

fun ejercicio_6() {
    print("Precio de su artículo -> ")
    val preciofinal = readln().trim().toFloat()

    println("Se ha pagado de IVA ${String.format("%.2f",preciofinal*0.10)}")
    println("El articulo sin IVA cuesta ${String.format("%.2f",preciofinal-(preciofinal*0.10))}")
}

fun ejercicio_12() {
    print("Peso (kg) -> ")
    val peso = readln().trim().toFloat()
    print("Altura (m) -> ")
    val altura = readln().trim().toFloat()

    val masa_corporal = String.format("%.2f",(peso/(altura*altura)))

    println("Tu indice de masa corporal $masa_corporal")
}

fun ejercicio_15() {
    print("Cuanto dinero va a depositar -> ")
    val dinero_ahorrado = readln().trim().toFloat()

    for (i in 1..3)  {
        println("Año $i :${i*dinero_ahorrado*0.04}")
    }
}

fun ejercicio_18(){
    print("Introduzca su usuario -> ")
    val usuario = readln().trim().lowercase()

    println(usuario)
    println(usuario.uppercase())
    for (word in usuario.split(" ")) {
        print(word.replaceFirstChar {char -> char.uppercase()})
        print(" ")
    }
}

fun ejercicio_20(){
    print("Introduzca un numero (formato: prefijo-numero-extension) -> ")
    val telefono = readln().trim()

    val NumeroTelefonico = telefono.split("-")[1]
    println(NumeroTelefonico)
}

fun ejercicio_21(){
    print("Introduzca una frase -> ")
    val FraseAinvertir = readln().trim()

    println(FraseAinvertir.reversed())

}

fun ejercicio_22() {
    print("Introduzca una frase -> ")
    var frase = readln().trim()
    print("Introduzca la vocal para poner en mayúscula -> ")
    val vocal: Char = readln()[0]

    if (vocal in frase) {
        val newPhrase = frase.replace(vocal,vocal.uppercaseChar())
        println(newPhrase)
        }
    }

fun ejercicio_24() {
    print("Introduce un precio de un producto (2 decimales) -> ")
    val precio = readln().trim()

    val precioDividido = precio.split(".")

    println("Euros: ${precioDividido[0]}")
    println("Centimos: ${precioDividido[1]}")
}

fun ejercicio_25() {
    print("Fecha de nacimiento -> ")
    val fecha = readln().trim()

    val fechaDividida = fecha.split("/")

    println("Dia: ${fechaDividida[0]}")
    println("Mes: ${fechaDividida[1]}")
    println("Año: ${fechaDividida[2]}")
}

fun ejercicio_26() {
    print("Lista de la compra -> ")
    val listaCompra = readln().trim()

    val listaCompraDivida = listaCompra.split(",")

    for (elemento in listaCompraDivida)
        println(elemento)
}

fun ejercicio_27() {
    print("Nombre del producto -> ")
    val productName = readln().trim()
    print("Precio de una unidad -> ")
    val productPrice : Float = readln().trim().toFloat()
    print("Unidades compradas -> ")
    val unitBoughted : Int = readln().trim().toInt()

    val totalCost : Float = productPrice * unitBoughted

    println(productName)
    println(String.format("%.2f",productPrice))
    println(String.format("%03d",unitBoughted))
    println(String.format("%.08d","%.2f",totalCost))
}

fun ejercicio_2_1() {
    val savedPassword = "contraseña"
    print("Escriba su contraseña -> ")
    val password = readLine()?.trim()

    if (password?.lowercase() == savedPassword) {
        println("La contraseña es correcta")
    } else {
        println("La contraseña es incorrecta")
    }
}

fun ejercicio_2_3() {
    try {
        print("Ingrese el dividendo -> ")
        val dividendo: Int = readln().trim().toInt()
        print("Ingrese el divisor -> ")
        val divisor: Int = readln().trim().toInt()

        if (divisor == 0) {
            throw NumberFormatException("DIVISOR 0 NO VALIDO")
        } else {
            val resultado: Int = dividendo / divisor
            println("El resultado de la division es: $resultado")
        }
    } catch (e: NumberFormatException) {
        println(e.message)
    }
}

fun ejercicio_2_6() {
    print("Nombre del alumno -> ")
    val nombre: String = readln().trim().replaceFirstChar { it.uppercaseChar() }
    print("Sexo del alumno (M/F) -> ")
    val sexo: String = readln().trim().uppercase()

    if ((sexo == "F" && nombre[0] < 'M') || (sexo == "M" && nombre[0] > 'N')) {
        println("El estudiante $nombre pertenece al grupo A")
    } else {
        println("El estudiante $nombre pertence al grupo B")
    }
}

fun ejercicio_2_8() {
    print("Introduzca su puntuacion -> ")
    val puntuacion = readln().trim().toDouble()

    val rendimiento = when {
        puntuacion == 0.0 -> "Inaceptable"
        puntuacion == 0.4 -> "Aceptable"
        puntuacion >= 0.6 -> "Meritorio"
        else -> "Puntuación no válida"
    }
    val primaDinero = 2400 * puntuacion

    if (rendimiento == "Puntuación no válida") {
        println("La puntuación no es valida")
    } else {
        println("Nivel de rendimiento: $rendimiento")
        println("Prima recibida: $primaDinero")
    }
}

fun ejercicio_2_10() {
    println("Hola, bienvenido a la pizzería Bella Napoli")

    print("¿Desea una pizza vegetariana? (Si/No) -> ")
    val eleccionPizza = readln().trim().replaceFirstChar { it.uppercaseChar() }

    val ingredientesVegetarianos = listOf("Pimiento", "Tofu")
    val ingredientesNoVegetarianos = listOf("Pepperoni", "Jamón", "Salmón")

    val ingredientesDisponibles = if (eleccionPizza == "Si") {
        println("Los ingredientes disponibles son: ${ingredientesVegetarianos.joinToString(", ")}")
        ingredientesVegetarianos
    } else {
        println("Los ingredientes disponibles son: ${ingredientesNoVegetarianos.joinToString(", ")}")
        ingredientesNoVegetarianos
    }

    print("Elija un ingrediente por favor (1-${ingredientesDisponibles.size}) -> ")
    val indiceIngrediente = readln().trim().toInt()

    if (indiceIngrediente in 1..ingredientesDisponibles.size) {
        val ingredienteElegido = ingredientesDisponibles[indiceIngrediente - 1]
        val tipoPizza = if (eleccionPizza == "SI") "vegetariana" else "no vegetariana"

        println("Su pizza $tipoPizza incluye Mozzarella, Tomate y $ingredienteElegido")
    } else {
        println("Selección no válida.")
    }
}

fun ejercicio_2_2_2() {
    print("Introduzca su edad -> ")
    val edad : Int = readln().trim().toInt()

    for (i in 1..edad) {
        print(i)
        if (i < edad) {
            print(", ")
        }

    }
}

fun ejercicio_2_2_4() {
    print("Introduzca un numero entero positivo -> ")
    val numero = readln().trim().toInt()

    if (numero > 0){
        for (i in numero downTo 0){
            print(i)
            if (i > 0) {
                print(", ")
            }
        }
    } else {
        print("Numero no válido")
    }
}

fun ejercicio_2_2_6(){
    print("Introduzca la altura del triangulo -> ")
    val altura = readln().trim().toInt()

    for (i in 1..altura) {
        println("*".repeat(i))
    }
}

fun ejercicio_2_2_7(){
    for (i in 1..10){
        println("Tabla del $i")
        println("-------------")
        for (j in 1..9) {
            println("$i x $j = ${i*j}")
        }
    }
}

fun ejercicio_2_2_8() {
    print("Ingrese un número entero para determinar las filas del triángulo: ")
    val filas: Int = readLine()?.toIntOrNull() ?: 0

    for (i in 0 until filas) {
        for (j in i * 2 downTo 0 step 2) {
            print("${j + 1} ")
        }
        println()
    }
}

fun ejercicio_2_2_13(){

    do {
        print("Grita algo en la cueva: ")
        val entradaUsuario = readln().trim()

        if (entradaUsuario.lowercase() != "salir")
        println("Se escucha a lo lejos $entradaUsuario")
    } while (entradaUsuario.lowercase() != "salir")
}

fun ejercicio_2_2_15(){
    var sumatoria = 0

    do{
        print("Introduzca un numero entero (0 para salir) -> ")
        val num = readln().trim().toInt()
        sumatoria += num
    } while (num != 0)

    println("La suma de todos los numeros introducidos es $sumatoria")
}

fun ejercicio_2_2_18(){
    var pares = 0
    var sumaDigitos = 0
    do{
        print("Introduzca un numero entero positivo -> ")
        val num = readln().trim()
        for (digit in num) {
            if (digit.isDigit()) {
                sumaDigitos += digit.digitToInt()
            }
        }
        println("La suma de los digitos es $sumaDigitos")

        if (num.toInt()%2 == 0) {
            pares++
        }

    } while (num.toInt() != -1)

    println("Ha introducido $pares numeros pares ")
}

fun ejercicio_2_2_19(){

    do{
        println("Menu")
        println("-------------------")
        println("1- Comenzar programa")
        println("2- Imprimir listado")
        println("3- Finalizar programa")
        print("-> ")
        val respuestaUsuario = readln().trim().toInt()

        if (respuestaUsuario in 0..3) {
            when {
                respuestaUsuario == 1 -> println("Ha seleccionado la opcion 1")
                respuestaUsuario == 2 -> println("Ha seleccionado la opcion 2")
            }
        } else {
            println("Valor invalido introducido")
        }
    } while (respuestaUsuario != 3)

    println("Me las piro vampiro")
}

fun ejercicio_2_2_25(){
    print("Introduzca una frase -> ")
    val frase = readln().trim().split(" ")
    var palabraLarga = ""
    for (word in frase){
        if(word.length > palabraLarga.length)
            palabraLarga = word
    }
    println("La palabra mas larga de la frase era $palabraLarga y habia ${frase.size} palabras")
}

fun ejercicio_2_3_2() {
    try {
        print("Introduzca un numero entero positivo -> ")
        val num = readln().trim().toInt()

        if (num < 0) {
            throw NumberFormatException("No puedes poner numeros negativos")
        } else {
            for (i in 1..num) {
                print(i)
                if (i < num) {
                    print(", ")
                }
            }
        }
    } catch (e: NumberFormatException){
        println(e.message)
    }
}

fun ejercicio_2_3_3() {
    var num: Int

    do {
        try {
            print("Introduzca un numero entero positivo -> ")
            num = readln().trim().toInt()

            if (num < 0) {
                throw NumberFormatException("No puedes poner numeros negativos")
            } else {
                for (i in num downTo 0) {
                    print(i)
                    if (i > 0) {
                        print(", ")
                    }
                }
            }
        } catch (e: NumberFormatException) {
            println(e.message)
            num = -1
        }
    } while (num < 0)
}

fun ejercicio_2_3_4() {

        try {
            print("Introduzca un número entero -> ")
            val num = readLine()?.trim()?.toInt() ?: throw NumberFormatException("La entrada no es un número entero.")

            // El código aquí se ejecutará si la conversión a entero es exitosa
            println("Número ingresado: $num")
        } catch (e: NumberFormatException) {
            println("La entrada no es correcta: ${e.message}")
        }
    }

fun ejercicio_3_1_4(){
    val listaNumeros = mutableListOf<Int>()

    for (i in 1..6){
        print("Introduce el numero $i -> ")
        val numero = readln().toInt()

        if (numero in 1..49){
            listaNumeros.add(numero)
        } else{
            println("Numero no valido")
        }
    }
    listaNumeros.sort()

    println("La lista de los numeros ganadores es ${listaNumeros.joinToString(", ")}")
}

fun ejercicio_3_1_6(){
    val listaAsignaturas = mutableListOf<String>()
    val listaNotas = mutableListOf<Double>()
    var entradaUsuario = "a"

    while (entradaUsuario != ""){
        print("Introduzca una asignatura -> ")
        entradaUsuario = readln()

        if (entradaUsuario.toIntOrNull() == null) {
            listaAsignaturas.add(entradaUsuario)
        } else {
            println("Eso no es una asignatura")
        }
    }

      var i = 1
      while (i < listaAsignaturas.size) {
            print("Introduzca la nota de ${listaAsignaturas[i-1]} -> ")
            val nota = readln()

            if (nota.toDoubleOrNull() == null) {
              println("Nota invalida")
            } else if (nota.toDouble() > 5.0 ){
                listaAsignaturas.removeAt(i-1)
            } else {
                i++
            }
        }

  println("Tienes que repetir ${listaAsignaturas.joinToString(", ")}")
}