package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

//Va a recibir una VISTA! la que va a pintar después??
//Y va a extender la vista del recycler view
//Adentro del (view: View) está lo relacionado con la vista
class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)


    fun render(taskCategory: TaskCategory) {

        when(taskCategory){
            TaskCategory.Business -> {
                tvCategoryName.text = R.string.todo_categorie_business.toString()
            }
            TaskCategory.Other -> {
                tvCategoryName.text = R.string.todo_categorie_other.toString()
            }
            TaskCategory.Personal -> {
                tvCategoryName.text = R.string.todo_categorie_personal.toString()
            }
            TaskCategory.Piano -> {
                tvCategoryName.text = R.string.todo_categorie_piano.toString()
            }
            TaskCategory.Training -> {
                tvCategoryName.text = R.string.todo_categorie_training.toString()
            }
        }
    }

}