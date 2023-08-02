package com.valeraquemaque.androidmaster.aristidevs.exercises.android_sintaxis

/**
 * Valores y Variables
 * en Kotlin
 *
 * ¿Cómo lo realiza?
 * val es para avisarle que es una variable
 * name es para darle nombre name a la variable
 */

const val age2: Int = 28

fun main() {
    showMyName()
    showMyAge(28)
    add(2, 3)
    val mySubtract = subtract(10, 8)
    println("The subtract is: $mySubtract")
}

//Funciones sin parámetros
fun showMyName() {
    println("My name is Valeria")
}

//Funciones con parámetro de entrada
fun showMyAge(currentAge: Int) {
    println("My age is $currentAge years old")
}

//Funciones con parámetro de salida
fun add(firstNumber:Int, secondNumber:Int){
    println("The addition is: " + (firstNumber + secondNumber))
}

//Funciones con parámetro de salida
//Solo vas a poder devolver UNA cosa -puede ser variable, objeto etc
fun subtract(firstNumber:Int, secondNumber:Int):Int{
    return firstNumber - secondNumber
}

fun valoresNumericos() {
    /**
     *  Variables numéricas
     */

    //Int -2,147,483 a 2,147,483,647
    val age: Int = 30

    //Long -9,223,372,036,854,775,807
    val example: Long = 30

    //Float
    val floatExample: Float = 30.5f

    //Double 14 decimales. Más memoria en el dispositivo, no olvidar!
    val doubleExample: Double = 3241.32212

    /**
     * Operaciones aritméticas
     */

    println("Sumar: ")
    println(age + age2)

    println("Restar: ")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("Dividir: ")
    println(age / age2)

    println("Módulo")
    println(age % age2)

    //Para poner cambios de variables
    var age2: Int = 30
    println(age2)
    age2 = 29
    println(age2)

    // TODO println perite imprimir y en nuevas líneas (ln)

}

fun valoresAlfanumericos() {

    /**
     *  Variables alfanuméricas
     *  Contienen otros componentes además de los números
     */

    //Char
    val charExample1: Char = 'e'
    val charExample2: Char = '@'
    val charExample3: Char = '2'

    //String dos formas de escribirla
    val stringExample: String = "LO que sea que quiera escribir"
    val stringExample2 = "LO que sea que quiera escribir"

}

fun valoresBooleanos() {
    /**
     * Variables booleanas
     */

    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false

    //Recordemos que no se puede repetir nombres de variables :)
    //Lo que hicimos hasta aquí es hacer guardados en la memoria

    //pinta la variable. Imprime la variable.
    println(booleanExample1)

    // TODO LOS VAL NO PUEDEN SER REASIGNADOS

}