package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

//Va a recibir una VISTA! la que va a pintar después??
//Y va a extender la vista del recycler view
//Adentro del (view: View) está lo relacionado con la vista
class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)
    private val viewContainer:CardView = view.findViewById(R.id.viewContainer)

    fun render(taskCategory: TaskCategory, onItemSelected: (Int) -> Unit) {

        val color = if(taskCategory.isSelected){
            R.color.todo_background_card
        }else {
            R.color.todo_background_disabled
        }

        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))

        itemView.setOnClickListener { onItemSelected(layoutPosition) }

        when(taskCategory){
            TaskCategory.Business -> {
                tvCategoryName.text = itemView.context.getString(R.string.todo_categorie_business)
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_business_category)
                    //para el contexto, le agrego divider.context, está adentro del mismo componente
                    // THIS no va.
                )
            }

            TaskCategory.Personal -> {
                tvCategoryName.text = itemView.context.getString(R.string.todo_categorie_personal)
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_personal_category)
                )
            }
            TaskCategory.Piano -> {
                tvCategoryName.text = itemView.context.getString(R.string.todo_categorie_piano)
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_piano_category)
                )
            }
            TaskCategory.Training -> {
                tvCategoryName.text = itemView.context.getString(R.string.todo_categorie_training)
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_training_category)
                )
            }

        TaskCategory.Other -> {
            tvCategoryName.text = itemView.context.getString(R.string.todo_categorie_other)
            divider.setBackgroundColor(
                ContextCompat.getColor(divider.context, R.color.todo_other_category)
            )
        }

        }
    }
}