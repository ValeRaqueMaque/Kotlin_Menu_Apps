package com.valeraquemaque.androidmaster.aristidevs.exercises.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.valeraquemaque.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Aquí entra lo primero que hace el activity

        val etWriting = findViewById<AppCompatEditText>(R.id.etWriting);
        val btnEnter = findViewById<AppCompatButton>(R.id.btnEnter);

        btnEnter.setOnClickListener {
            val name = etWriting.text.toString()

            if (name.isNotEmpty()) {
//                Log.i("AndroidMaster", "Se ha pulsado el botón con la información: ${name}")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}