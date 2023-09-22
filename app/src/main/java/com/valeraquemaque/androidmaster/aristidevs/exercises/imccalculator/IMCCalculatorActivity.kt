package com.valeraquemaque.androidmaster.aristidevs.exercises.imccalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.card.MaterialCardView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.valeraquemaque.androidmaster.R
import java.text.DecimalFormat

class IMCCalculatorActivity : AppCompatActivity() {

    //Se podría hacer con un solo boolean pero por ahora
    //lo dejamos así
    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var isOtherSelected: Boolean = false
    private var currentWeight: Int = 31
    private var currentHeight: Int = 120
    private var currentAge: Int = 11

    //Para no agregarlo dentro del OnCreate y que quede
    // toodo junto, se declara por fuera este componente
    private lateinit var cardMale: MaterialCardView
    private lateinit var cardFemale: MaterialCardView
    private lateinit var cardOther: MaterialCardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeigt: RangeSlider
    private lateinit var tvWeight: TextView
    private lateinit var btnSubtractWeight: FloatingActionButton
    private lateinit var btnPlusWeight: FloatingActionButton
    private lateinit var tvAge: TextView
    private lateinit var btnSubtractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var btnCalculate: Button

    //lo que hcemos aquí todo el mundo puede acceder
    companion object {
        const val IMC_KEY = "IMC_RESULT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccalculator)
        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents() {
        cardMale = findViewById(R.id.cardMale)
        cardFemale = findViewById(R.id.cardFemale)
        cardOther = findViewById(R.id.cardAnother)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeigt = findViewById(R.id.rsHeight)
        tvWeight = findViewById(R.id.tvWeight)
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvAge = findViewById(R.id.tvAge)
        btnSubtractAge = findViewById(R.id.btnSubtractAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        btnCalculate = findViewById(R.id.btnCalculate)
    }

    private fun initListeners() {

        cardMale.setOnClickListener {
            setGenderSelection(true, false, false)
            setGenderColor()
        }
        cardFemale.setOnClickListener {
            setGenderSelection(false, true, false)
            setGenderColor()
        }
        cardOther.setOnClickListener {
            setGenderSelection(false, false, true)
            setGenderColor()
        }
        rsHeigt.addOnChangeListener { _, value, _ ->
            //formatear el decimal
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"
        }
        btnSubtractWeight.setOnClickListener {
            currentWeight -= 1

            if (currentWeight < 30) {
                currentWeight = 30
            }
            setWeight()
        }
        btnPlusWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }
        btnSubtractAge.setOnClickListener {
            currentAge -= 1
            if (currentAge < 10) {
                currentAge = 10
            }
            setAge()
        }
        btnPlusAge.setOnClickListener {
            currentAge += 1
            setAge()
        }
        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result) //le enviamos lo que recibimos de calcular el IMC
        }
    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this, ResultIMCActivity::class.java)
        //le agregamos el valor
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)
    }

    private fun initUI() {
        setGenderColor()
        setWeight()
        setAge()
    }

    private fun calculateIMC(): Double {
        //dividr el peso entre la altura al cuadrado
        val df = DecimalFormat("#.##")
        val imc = currentWeight / (currentHeight.toDouble() / 100 * currentHeight.toDouble() / 100)
        return df.format(imc).toDouble()
    }

    private fun setAge() {
        tvAge.text = currentAge.toString()
    }

    //Para ir cambiando la variable al texto del Weight
    private fun setWeight() {
        tvWeight.text = currentWeight.toString()
    }

    private fun setGenderSelection(
        isMaleSelected: Boolean,
        isFemaleSelected: Boolean,
        isOtherSelected: Boolean
    ) {
        this.isMaleSelected = isMaleSelected
        this.isFemaleSelected = isFemaleSelected
        this.isOtherSelected = isOtherSelected
    }

    private fun setGenderColor() {
        cardFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
        cardMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        cardOther.setCardBackgroundColor(getBackgroundColor(isOtherSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
        val colorReference = if (isSelectedComponent) {
            R.color.imc_background_component_selected
        } else {
            R.color.imc_background_component
        }

        return ContextCompat.getColor(this, colorReference)
    }

}