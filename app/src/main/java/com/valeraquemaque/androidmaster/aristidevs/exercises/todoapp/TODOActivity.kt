package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.os.Build.VERSION
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R
import com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp.TaskCategory.*

class TODOActivity : AppCompatActivity() {

    private val categories = listOf(
        Business,
        Personal,
        Training,
        Piano
    )

    private val tasks = mutableListOf(
        Task("PruebaBusiness", Business),
        Task("PruebaPersonal", Personal),
        Task("PruebaOther", Other),
        Task("PruebaPiano", Piano),
        Task("PruebaTraining", Training)
    )

    private lateinit var rvCategories:RecyclerView
    private lateinit var categoriesAdapter:CategoriesAdapter

    private lateinit var rvTasks:RecyclerView
    private lateinit var tasksAdapter:TasksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todoactivity)
        initcomponents()
        initUI()
    }

    private fun initcomponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
    }

    private fun initUI() {
        //inicializamos el listado de categorías
        categoriesAdapter = CategoriesAdapter(categories)

        //agrego el Layout y le indico la vista que será de forma horizontal
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        tasksAdapter = TasksAdapter(tasks)
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = tasksAdapter
    }
}