package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

//Esta clase va a recibir parámetros. Se los agregamos :). Una lista privada de Task Categories, una sealed class que hicimos antes
//Luego hay que pintar esta clase
class CategoriesAdapter(private val categories: List<TaskCategory>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        //Create a view and pass it to onBindViewHolder
        //Remember: our views must be called "item_name" -item_task_category here!-
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesViewHolder(view)
    }

    //Method that shows task categories.
    override fun getItemCount() = categories.size // = return modo proKotlin kpa

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        //Pasa la información a pintar
        holder.render(categories[position])
    }

}