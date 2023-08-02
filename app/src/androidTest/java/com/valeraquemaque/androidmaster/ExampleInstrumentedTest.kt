package com.valeraquemaque.androidmaster

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.runner.RunWith
import java.io.IOException
import java.util.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
import java.util.Scanner

object ExampleInstrumentedTest {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        var mensaje = "es menor";
        val scanner = Scanner(System.`in`)
        println("Buen día.  Ingrese edad")
        val edad = scanner.nextInt()


        if (edad >= 18) mensaje = "es mayor";
        println(mensaje);

    }
}
