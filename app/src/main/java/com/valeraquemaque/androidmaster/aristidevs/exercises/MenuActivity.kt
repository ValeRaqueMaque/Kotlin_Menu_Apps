package com.valeraquemaque.androidmaster.aristidevs.exercises

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.valeraquemaque.androidmaster.R
import com.valeraquemaque.androidmaster.aristidevs.exercises.firstapp.ResultActivity
import com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp.TODOActivity
import com.valeraquemaque.androidmaster.aristidevs.exercises.imccalculator.IMCCalculatorActivity
import com.valeraquemaque.androidmaster.aristidevs.exercises.superheroapp.SuperheroListActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCCalculator = findViewById<Button>(R.id.btnIMCCalculatorApp)
        val btnTODO = findViewById<Button>(R.id.btnTODOApp)
        val btnSuperheroApp = findViewById<Button>(R.id.btnSuperheroApp)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCCalculator.setOnClickListener { navigateToIMCalculator() }
        btnTODO.setOnClickListener { navigateToTODOApp() }
        btnSuperheroApp.setOnClickListener { navigateToSuperheroApp() }

    }

    private fun navigateToTODOApp() {
        val intent = Intent(this, TODOActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCalculator() {
        val intent = Intent(this, IMCCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp(){
        val intent = Intent(this, SuperheroListActivity::class.java)
        startActivity(intent)
    }
}