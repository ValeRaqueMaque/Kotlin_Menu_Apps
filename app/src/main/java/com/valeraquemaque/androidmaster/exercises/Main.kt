package com.valeraquemaque.androidmaster.exercises

fun main() {
    imprimirNombre(nombre = "Valeria", apellido = "Maqueda")

    /**
     * LISTAS Y ARRAYS
     */

    //Lista inmutable
    val listaDeNombres = listOf<String>("Javier", "Carolina", "Mario")
    println(listaDeNombres)
    //El detalle de esta lista es que no se puede modificar, por ejemplo listaDeNombres.remove

    //Lista mutable
    val listaMutable = mutableListOf<String>()
    println(listaMutable)

    //Modificar lista mutable
    listaMutable.add("Valeria")
    println(listaMutable)

    //Tomar datos de la lista por fuera de ella usando GET
    val valorUsandoGet = listaMutable.get(0)
    println(valorUsandoGet)

    //Tomar valor con el index operator en Kotlin
    val valorOperatorIndex = listaMutable[0]
    println(valorOperatorIndex)

    //Tomar primer dato de una lista con posibilidad de que sea nula, evitando exception
    val primerValor: String? = listaDeNombres.firstOrNull()
    println(primerValor)
    //Si no sabemos bien qué puede obtener de dato, apretar ALT+ENTER para que me lo de

    //Borrar una parte específica de la lista
    listaMutable.removeAt(0)
    println(listaMutable)

    //Probamos tomar un valor de una lista vacía
    val valorVacío : String? = listaMutable.firstOrNull()
    println(listaMutable) //Me muestra la lista vacía []

    //Otra forma de eliminar elementos de una lista
    listaMutable.add("Enrique")
    println(listaMutable)
    listaMutable.removeIf { caracter -> caracter.length > 3 }
    println(listaMutable)

    //Array = Elemento que contiene lista
    //No es tan flexible como la lista
    val myArray = arrayOf(1, 2, 3, 4)
    println("Mi array es ${myArray.toList()}")
}

fun imprimirNombre ( nombre: String, segundoNombre: String = "Raquel", apellido: String){
    println("Mi nombre es $nombre $segundoNombre $apellido")
}

//fun main() {
//
    /**
     * Funciones y funciones de extensión
     */

//    val frase = "Verás este String en mayúscula si el resultado ha sido igual a 0, si no, en minus.".randomCase()
//    imprimirFrase(frase)
//}
//
//fun imprimirFrase(frase: String): Unit{
//    println("Tu frase es: $frase")
//}
//
//fun String.randomCase() :String {
//    val numeroAleatorio = 0..99
//    val resultadoAleatorio = numeroAleatorio.random() //Para darle un resultado distinto c/ vez
//    return if(resultadoAleatorio.rem(2) == 0){
//        this.uppercase()
//    } else
//        this.lowercase()
// }















    /**
     * SETS. Para listas con información que no se repita
     */
//
//    val setDeVocales = setOf('a','b', 'c', 'd', 'e', 'e')
//    println(setDeVocales)
//
//    val setDeNumerosMutables = mutableSetOf(1, 3, 5, 6)
//    println(setDeNumerosMutables)
//    println("------------------------")
//
//    setDeNumerosMutables.add(4)
//    setDeNumerosMutables.add(4)
//    println(setDeNumerosMutables)
//    println("-------------")
//
//    setDeNumerosMutables.remove(3)
//    println(setDeNumerosMutables)
//    println("------------------")

    /**
     * MAPS -> son keyvalor por cada key se le asigna un valor
     */
//
//    //Mapa inmutable
//    val edadDePersonajes =
//        mapOf("Wolverine" to 45, "Mario" to 40, "Princesa Peach" to 30, "Blade" to 40)
//    println(edadDePersonajes)
//
//    //Mapa mutable
//    val edadDePersonajesMutable = mutableMapOf("Wolverine" to 45, "Mario" to 40, "Princesa Peach" to 30, "Blade" to 40)
//    println(edadDePersonajesMutable)
//
//    //Agregar un valor más al mapa
//    edadDePersonajesMutable.put("Mikonos", 70)
//    println(edadDePersonajesMutable)
//
//    //Otra forma de agregar datos al mapa
//    edadDePersonajesMutable["Jons"] = 42
//    println(edadDePersonajesMutable)
//
//    //Quitar un valor del mapa
//    edadDePersonajesMutable.remove("Mikonos")
//    println(edadDePersonajesMutable)
//
//    //Tomar un valor específico del mapa
//    val edadMario = edadDePersonajesMutable["Mario"]
//    println(edadMario)
//
//    //Imprimir valores y keys del mapa
//    println(edadDePersonajesMutable.keys)
//    println(edadDePersonajesMutable.values)

    /**
     * MODIFICACIONES A LAS LISTAS
     */

//    val numerosDeLoteria = listOf<Int>(2, 3, 34, 56, 74, 2, 17)
//
//    val numerosOrganizados = numerosDeLoteria.sorted()
//    println(numerosOrganizados)
//    println("---------------------")
//
//    val numerosDescendientes = numerosDeLoteria.sortedDescending()
//    println(numerosDescendientes)
//    println("-------------------------")
//
//    val numerosDeLoteriaMenores = numerosDeLoteria.sortedBy { numero -> numero < 50 }
//    println(numerosDeLoteriaMenores)
//    println("--------------------------")
//
//    val numerosDeLoteriaAleatorios = numerosDeLoteria.shuffled()
//    println(numerosDeLoteriaAleatorios)
//    println("---------------------------")
//
//    val numerosEnReversa = numerosDeLoteria.reversed()
//    println(numerosEnReversa)
//    println("--------------------")
//
//    val numerosMapeados = numerosDeLoteria.map { numero -> "Tu número de la lotería es $numero" }
//    println(numerosMapeados)
//    println("-----------------")
//
//    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
//    println(numerosFiltrados)
//

