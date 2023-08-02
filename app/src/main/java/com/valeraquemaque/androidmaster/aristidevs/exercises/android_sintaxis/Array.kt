package com.valeraquemaque.androidmaster.aristidevs.exercises.android_sintaxis

fun main() {
    //Un índice comienza en 0, pero la cantidad de posiciones se cuenta desde 1
    //Indice 0-6
    //Tamaño 7
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(weekDays[5])
    println(weekDays.size)

    //Tamaños
    if (weekDays.size >= 8)
        println(weekDays[7])
    else
        println("No hay valores de este tamaño en el array")

    //Modificar valores
    weekDays[0] = "Gran Lunes"
    println(weekDays[0])

    //Bucles en Array
    for(position in weekDays.indices){
        println("Pasé por la posición n°$position")
    }

    for((position, value) in weekDays.withIndex()){
        println("El valor $value de la posición $position")
    }

    for(weekday in weekDays){
        println("Estamos en el día $weekday")
    }
}