package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.valeraquemaque.androidmaster.R

class TasksViewHolder (view: View) : RecyclerView.ViewHolder(view){

    private var tvTask:TextView = view.findViewById(R.id.tvTask)
    private var cbTask:CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {
        tvTask.text = task.name
    }
}