package com.valeraquemaque.androidmaster.aristidevs.exercises.android_exercises

/**
 * Por lo general, el teléfono te proporciona un resumen de notificaciones.
 *
 * En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste. El mensaje debe incluir lo siguiente:
 *
 * - La cantidad exacta de notificaciones cuando haya menos de 100.
 * - 99+ como cantidad de notificaciones cuando haya 100 o más.
 *
 * Completa la función printNotificationSummary() para que el programa imprima estas líneas:
 *
 * - You have 51 notifications
 * - Your phone is blowing up! You have 99+ notifications.
 */

fun main() {

    val morningNotification = 51
    val earningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(earningNotification)
}

fun printNotificationSummary(quantityNotification: Int) {
    if (quantityNotification > 0 && quantityNotification < 100) {
        println("You have $quantityNotification notifications")
    } else if (quantityNotification > 99)
        println("Your phone is blowing up! You have 99+ notifications.")

    // if(quantityNotification >= 100)
    //      println("Your phone..."
//        else
    //   println("You have $quantityNotifications notification")
}