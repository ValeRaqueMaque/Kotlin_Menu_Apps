package com.valeraquemaque.androidmaster.aristidevs.exercises.android_sintaxis

fun main() {
    println("Ingresá el primer numero")

    println("Ingresá el segundo numero")

    println("Ingresá el operador")
    mejorandoIfconMeses("+")
    }

fun mejorandoIfconMeses(operator:String) {
    when (operator) {
        "+" -> suma(11,12)
        "-" -> resta()
//        3 -> println("mes marzo")
//        in 4..10 -> println("entre abril y octubre")
//        11 -> {
//            println("el mejor mes: noviembre")
//            println("podríamos decirlo nuevamente: el mejor mes")
//        }
//        12 -> print("diciembre")
//        !in 1..12 -> println("no esta entre los meses del año")
        else -> {
            "Nada nuevo o interesante"
        }
    }
}

fun resta() {
    TODO("Not yet implemented")
}

fun suma(numero1:Int, numero2:Int) {
    println("La suma es: " + (numero1+numero2))
}
