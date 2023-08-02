package com.valeraquemaque.androidmaster.aristidevs.exercises.todoapp

sealed class TaskCategory {
    object Personal :TaskCategory()
    object Business :TaskCategory()
    object Other :TaskCategory()
}

