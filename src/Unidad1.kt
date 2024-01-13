import java.lang.reflect.Array
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.roundToLong
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

fun ejercicio_3_1_8(){
    println("**COMPROBADOR PALABRAS PALINDROMAS**")
    print("Introduzca su palabra para ser COMPROBADA -> ")
    val palabra = readln().trim().toList()

    if (palabra == palabra.asReversed()){
        println("${palabra.joinToString("")} palindroma detectada")
    } else {
        println("${palabra.joinToString("")} no es palindroma")
    }
}

fun ejercicio_3_1_9(){
    print("Introduzca una palabra, lets see how much vocals it has -> ")
    val palabra = readln().trim().lowercase().toList()
    val vocales = mutableListOf<Int>(0,0,0,0,0) // (a,e,i,o,u)

    for (letter in palabra){
        when {
            letter == 'a' -> vocales[0]++
            letter == 'e' -> vocales[1]++
            letter == 'i' -> vocales[2]++
            letter == 'o' -> vocales[3]++
            letter == 'u' -> vocales[4]++
        }
    }
    println("CONTEO DE VOCALES")
    println(" a -> ${vocales[0]} \n e -> ${vocales[1]} \n i -> ${vocales[2]} \n o -> ${vocales[3]} \n u -> ${vocales[4]}")
}

fun ejercicio_3_1_10(){
    val listaPrecios = listOf<Int>(50, 75, 46, 22, 80, 65, 8)

    val precioMenor = listaPrecios.minOrNull()
    val precioMayor = listaPrecios.maxOrNull()

    print("Precio mayor -> $precioMayor\nPrecio Menor -> $precioMenor")
}

fun ejercicio_3_1_13(){
    print("Introduzca una muestra numerica separada por comas -> ")
    val listaString = readln().trim().split(",")
    val listaNumerica = mutableListOf<Int>()
    var sumaAritmetica = 0.0
    var suma: Int = 0
    var desviacionTipica = 0.0

    for (numero in listaString){
        listaNumerica.add(numero.toInt())
    }

    for (numero in listaNumerica){
        suma += numero
    }
    val media = suma/listaNumerica.size

    for (numero in listaNumerica){
        sumaAritmetica += ((numero - media) * (numero - media))

    }

    desviacionTipica = ((sumaAritmetica/listaNumerica.size))
    val desviacionTipica2 = desviacionTipica.pow(0.5)
    val desviacionResultado = ""

    println("Media -> $media")
    println("Desviacion tipica -> ${"%.2f".format(desviacionTipica2)}")
}

fun ejercicio_3_2_3() {

    val priceMap = mapOf("platano" to 1.35, "manzana" to 0.80, "pera" to 0.85, "naranja" to 0.70)

    print("¿Que fruta desea ? -> ")
    val fruitUser = readln().trim().lowercase()

    print("¿Cuantos kilos se llevara -> ")
    val weight = readln().trim().toDouble()

    when {
        fruitUser in priceMap.keys -> print("Cuesta ${"%.2f".format(weight * priceMap[fruitUser]!!)} ")
        fruitUser !in priceMap.keys -> println("No tenemos esa fruta")
    }
}

fun ejercicio_3_2_5(){
    val creditsMap = mapOf("matematicas" to 6, "fisica" to 4, "quimica" to 5)
    var totalCredits = 0

    for ((asignatura, creditos) in creditsMap) {
        println("${asignatura.replaceFirstChar { it.uppercaseChar()}} tiene $creditos")
        totalCredits += creditos

    }
    println("Total de creditos: $totalCredits")
}

fun ejercicio_3_2_6(){
    val mapUserData = mutableMapOf<String, Any>()

    do {
        print("Que dato va a introducir -> ")
        val tipoDato = readln().trim().lowercase()

        print("Dato (ENTER para salir) -> ")
        val dato = readln().trim().lowercase()

        mapUserData[tipoDato] = dato

        for ((key, value) in mapUserData) {
            println("$key -> $value")
        }

    } while (dato.isNotEmpty())

}

fun ejercicio_3_2_8(){
    val diccionario = mutableMapOf<String, String>()

    print("Palabra:Traduccion y cada par separados por comas \\n -> ")
    val translatedWords = readln().trim().split(",")

    translatedWords.forEach { pair ->
        val (key, value) = pair.split(":")
        diccionario[key] = value
    }

    print("Introduzca una frase -> ")
    val frase = readln().trim().split(" ").toMutableList()

    diccionario.keys.forEach {  if (it in frase) {
            val index = frase.indexOf(it)
            frase[index] = diccionario[it]!!
        }
    }
    println(frase.joinToString(" "))
}

fun ejercicio_3_2_10() {
    val nifCliente = mutableMapOf<String, Map<String, Any>>()


    val nombre = {
        print("Nombre -> ")
        readln().trim().lowercase().replaceFirstChar { it.uppercaseChar() }
    }

    val direccion = {
        print("Direccion -> ")
        readln().trim()
    }
    val telefono = {
        var input: String
        var todoOk = false

        do {
            print("Numero de telefono -> ")
            input = readln().trim()

            if (input.length == 9) {

                todoOk = true
            } else {
                println("Telefono invalido")
            }
        } while (!todoOk)


        input
    }



    val correo = {
        var input: String
        var correoverificado = false

        do {
            print("Correo -> ")
            input = readln().trim()

            if ("@" in input && ".com" in input) {
                correoverificado = true
            } else {
                println("Correo no válido")
            }
        } while (!correoverificado)

        input
    }

    val preferencia = {
        var todoOk = false
        var respuesta: Boolean? = null

        do {
            print("Es un cliente preferente (s/n) -> ")
            val input = readln().trim().lowercase()

            when (input) {
                "s" -> {
                    respuesta = true
                    todoOk = true
                }
                "n" -> {
                    respuesta = false
                    todoOk = true
                }
                else -> println("Respuesta invalida")
            }
        } while (!todoOk)

        respuesta
    }



    val nif = {
        var input: String
        var nifCorrecto = false

        do {
            print("NIF -> ")
            input = readln().trim()

            if (input.length == 9 && input.substring(0, 7).toIntOrNull() != null && input[8].digitToIntOrNull() == null) {
                nifCorrecto = true
            } else {
                println("NIF invalido")
            }
        } while (!nifCorrecto)

        input
    }

    val menu = {
        do {
            print(
                "1 -> Añadir cliente\n2 -> Eliminar cliente\n3 -> Mostrar cliente\n" +
                        "4 -> Listar todos los clientes\n5 -> Listar clientes preferentes\n6 -> Terminar\n-> "
            )
            val respuesta = readln().trim().toIntOrNull()

            when (respuesta) {
                1 -> {
                    val nombreCliente = nombre()
                    val direccionCliente = direccion()
                    val telefonoCliente = telefono()
                    val correoCliente = correo()
                    val preferenciaCliente = preferencia()

                    val nifUsuario = nif()

                    val datosCliente: Map<String, Any?> =
                        mapOf("Nombre" to nombreCliente,
                            "Direccion" to direccionCliente,
                            "Telefono" to telefonoCliente,
                            "Correo" to correoCliente,
                            "Preferencia" to preferenciaCliente)

                    nifCliente[nifUsuario] = datosCliente as Map<String, Any>

                }
                2 -> {
                    print("Introduce el NIF del usuario a borrar -> ")
                    val nifUsuario = nif()
                    nifCliente.remove(nifUsuario)
                    print("Usuario borrado")
                }
                3 -> {
                    val nifUsuario = nif()
                    val clienteDetails = nifCliente[nifUsuario]

                    if (clienteDetails != null){
                        println("${clienteDetails. forEach{
                            key, value -> print("$key -> ${clienteDetails[key]}\n")
                        }}")
                    } else {
                        println("No hay nadie con ese NIF")
                    }
                }
                4 -> {
                    nifCliente.forEach {
                        nif, datos -> print("NIF: $nif -> Nombre: ${datos["Nombre"]}\n")
                    }
                }
                5 -> {
                    nifCliente.forEach {
                            nif, datos -> if (datos["Preferencia"] == true){
                                print("NIF: $nif -> Nombre: ${datos["Nombre"]}\n")
                    } else {
                        print("No hay clientes preferentes")
                    }
                    }
                }
                6 -> println("Terminando...")
                else -> println("Opción inválida")
            }
        } while (respuesta != 6)
    }
    menu()
}

fun ejercicio_3_2_11() {

    val fichero =
        "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7".split(
            "\n"
        )

    val claves = fichero[0].split(";")

    val conjuntoClientes = mutableMapOf<String, Map<String, Any>>()

    fichero.subList(1, fichero.size).forEach { linea ->
        val datos = linea.split(";")

        val info = mutableMapOf<String, Any>()

        for (i in claves.indices) {
            if (i != 0) {
                val clave = claves[i]
                val valor = when (clave) {
                    "descuento" -> datos[i].toDouble()
                    else -> datos[i]
                }
                info[clave] = valor
            }
            conjuntoClientes[datos[0]] = info

        }
    }
    println(conjuntoClientes)
}

fun ejercicio_3_3_1(){
    val residence_list: (List<List<Any>>) -> MutableSet<Any> = { list ->
        val residences = mutableSetOf<Any>()

        for (residence: List<Any> in list) residences.add(residence[3])

        residences
    }

    val billData = listOf(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958, "Mirasol 218"))

        val domicilies = residence_list(billData)

    println("DOMICILIOS A ENVIAR -> ${domicilies.forEach{ println(it) }}")


}

fun ejercicio_3_3_2(){
    val estudiantesPrimaria = {
        val estudiantes= mutableSetOf<String>()

        do{
            print("Nombre estudiante de primaria (x para salir) -> ")
            val nombre = readln().trim()

            if (nombre != "x"){
                estudiantes.add(nombre)
            }

        } while (nombre.lowercase() != "x")

        estudiantes
    }

    val estudiantesSecundaria = {
        val estudiantes= mutableSetOf<String>()

        do{
            print("Nombre estudiante de primaria (x para salir) -> ")
            val nombre = readln().trim()

            estudiantes.add(nombre)
        } while (nombre.lowercase() != "x")

        estudiantes
    }

    val mostrarEstudiantes: (MutableSet<String>, MutableSet<String>) -> Unit = { estudiantesPrimaria, estudiantesSecundaria ->
        println("Nombres de los alumnos de primaria y secundaria:")
        println(estudiantesPrimaria.union(estudiantesSecundaria))

        val nombresRepetidos = estudiantesPrimaria.intersect(estudiantesSecundaria)
        println("Nombres que se repiten entre primaria y secundaria:")
        println(nombresRepetidos)

        // Mostrar nombres de primaria que no se repiten en secundaria
        val nombresUnicosPrimaria = estudiantesPrimaria.subtract(estudiantesSecundaria)
        println("Nombres de primaria que no se repiten en secundaria:")
        println(nombresUnicosPrimaria)

        // Mostrar si todos los nombres de primaria están incluidos en secundaria
        val todosEnSecundaria = estudiantesPrimaria.all { it in estudiantesSecundaria }
        println("¿Todos los nombres de primaria están incluidos en secundaria?: " +
                "${ if (todosEnSecundaria) "Si" else "No"}")
    }

    val primaria = estudiantesPrimaria()
    val secundaria = estudiantesSecundaria()

    mostrarEstudiantes(primaria, secundaria)
}

fun ejercicio_3_3_3(){
    val conjuntoPotencia: (Set<Int>) -> List<Set<Int>> = {
        val originalList = it.toList()
        val n = originalList.size
        val result = mutableListOf(emptyList<Int>())

        var i = 0
        while (i < n) {
            val currentElement = originalList[i]
            val newSubset = result.map { subset -> subset + listOf(currentElement) }
            result.addAll(newSubset)
            i++
        }

        val orderedResult = result.sortedBy { it.size }

        orderedResult.map { it.toSet() }
    }

   val exampleSet = setOf(0,1,2)
    val conjunto = conjuntoPotencia(exampleSet)
    print(conjunto)
}

fun ejercicio_3_3_4(){
    val setFrutas1 = setOf("manzana", "pera", "naranja", "plátano", "uva")
    val setFrutas2 = setOf("manzana", "pera", "durazno", "sandía", "uva")

    val frutasComunes = setFrutas1.intersect(setFrutas2)
    val frutasSoloEnFrutas1 = setFrutas1.subtract(setFrutas2)
    val frutasSoloEnFrutas2 = setFrutas2.subtract(setFrutas1)

    println(frutasComunes)
    println(frutasSoloEnFrutas1)
    println(frutasSoloEnFrutas2)
}

fun ejercicio_3_3_5(){
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }.toSet()

    val multiplo3 = numeros.filter { it % 3 == 0 }.toSet()

    val paresYMultiplosDe3 = pares.intersect(multiplo3)

    println(pares)
    println(multiplo3)
    println(paresYMultiplosDe3)

}

fun ejercicio_3_3_6(){
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    val consonantes = ('a' .. 'z').toSet().subtract(vocales)

    val letrasComunes = vocales.intersect(consonantes) //estara vacio

    println(vocales)
    println(consonantes)
    println(letrasComunes)

}


