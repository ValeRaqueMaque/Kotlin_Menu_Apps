package com.valeraquemaque.androidmaster.aristidevs.exercises.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView
import com.valeraquemaque.androidmaster.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val txtEnter = findViewById<AppCompatTextView>(R.id.txtStart)
        val name = intent.extras?.getString("EXTRA_NAME").orEmpty()

        txtEnter.setText("Hola $name")
    }
}