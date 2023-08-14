package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

class TODOActivity : AppCompatActivity() {

    private val categories = listOf(
        TaskCategory.Business,
        TaskCategory.Personal,
        TaskCategory.Training,
        TaskCategory.Piano
    )

    private lateinit var rvCategories:RecyclerView
    private lateinit var categoriesAdapter:CategoriesAdapter

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
        //inicializamos el listado de categorías
        categoriesAdapter = CategoriesAdapter(categories)
        //agrego el Layout y le indico la vista que será de forma horizontal
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter
    }
}