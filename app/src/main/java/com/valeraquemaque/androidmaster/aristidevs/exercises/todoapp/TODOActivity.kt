package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

class TODOActivity : AppCompatActivity() {

    private lateinit var rvCategories:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todoactivity)
        initcomponents()
        initUI()
    }

    private fun initcomponents() {
        rvCategories = findViewById(R.id.rvCategories)
    }

    private fun initUI() {

    }
}