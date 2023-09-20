package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

sealed class TaskCategory (var isSelected:Boolean = true){
    object Personal :TaskCategory()
    object Business :TaskCategory()
    object Piano : TaskCategory()
    object Training : TaskCategory()
    object Other :TaskCategory()
}

