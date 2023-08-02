package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

//Va a recibir una VISTA! la que va a pintar después??
//Y va a extender la vista del recycler view
class CategoriesVIewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory) {
        tvCategoryName.setText("Estoy probando la nueva funcionalidad")
    }

}