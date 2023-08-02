package com.valeraquemaque.androidmaster.aristidevs.exercises.android_sintaxis

fun main() {
    var name: String? = "Ariel"
    name = null
    println(name?.get(3) ?: "This is a nullable thing")
}

