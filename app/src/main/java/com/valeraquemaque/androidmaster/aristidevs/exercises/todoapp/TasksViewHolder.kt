package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

/**
 * Función que pinta
 */
class TasksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var tvTask: TextView = view.findViewById(R.id.tvTask)
    private var cbTask: CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {

        if (task.isSelected) {
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        tvTask.text = task.name
        cbTask.isChecked = task.isSelected

        val color = when (task.category) {
            TaskCategory.Business -> R.color.todo_business_category
            TaskCategory.Personal -> R.color.todo_personal_category
            TaskCategory.Piano -> R.color.todo_piano_category
            TaskCategory.Training -> R.color.todo_training_category
            TaskCategory.Other -> R.color.todo_other_category
        }

        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)
        )
    }
}