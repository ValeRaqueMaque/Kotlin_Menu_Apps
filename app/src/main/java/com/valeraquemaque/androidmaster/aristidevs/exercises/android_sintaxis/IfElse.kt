package com.valeraquemaque.androidmaster.aristidevs.exercises.android_sintaxis

fun main() {
    ifBasico()
}

//Acordate de que se le puede pasar el name:String como parámetro al fun IfBasico
fun ifBasico() {

    /**
     * Un igual iguala valores, dos == compara
     */

    val name = "Val"
    if (name == "Pepe") {
        println("El valor asignado es Pepe")
    }else {
        println("Este no es Pepe")
    }
}

//fun ifBoolean(edad){
//    var mensaje = "No podes votar"
//
//    if(edad >= 18){
//        mensaje = "Podes votar"
//    }
//    return mensaje
//}

//Qué pasaría si el usuario agrega un nombre distinto, sin que yo lo sepa? Llegaría al final y no
// pasaría por el condicional de printear el valor

/**
 * name.lowercase
 * name.uppercase
 */