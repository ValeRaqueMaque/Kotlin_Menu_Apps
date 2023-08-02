package com.valeraquemaque.androidmaster.aristidevs.exercises.android_sintaxis

fun main(){
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    weekDays.add("Osvaldo")
    println(weekDays)
    weekDays.add(0,"Feriado")
    println(weekDays)

    if(weekDays.isEmpty()) {
    //no hacer nada
    }else weekDays.forEach {println(it)}

    if(weekDays.isNotEmpty()){
        weekDays.forEach {println(it)}
    }

    weekDays.last()

    //Acá sería lo mismo que en Arrays
    for(suscribete in weekDays){

    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(readOnly.size)
    println("Los días de la semana son $readOnly")
    println("El primer día de la semana es " + readOnly[0])
    println(readOnly.first())
    println(readOnly.last())

    //Filter
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //Iterar
    readOnly.forEach{weekDay -> println(weekDay)}
}