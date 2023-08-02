package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

//Esta clase va a recibir parámetros. Se los agregamos :). Una lista prvivata de Task Categories, una sealed class que hicimos antes
//Luego hay que pintar esta clase
class CategoriesAdapter(private val categories: List<TaskCategory>) :
    RecyclerView.Adapter<CategoriesVIewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesVIewHolder {
        //Crea la vista y se la pasa al BindViewHolder para que la pinte
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesVIewHolder(view)
    }

    override fun getItemCount() = categories.size // = return modo proKotlin kpa

    override fun onBindViewHolder(holder: CategoriesVIewHolder, position: Int) {
        //Pasa la información a pintar
        holder.render(categories[position])
    }

}