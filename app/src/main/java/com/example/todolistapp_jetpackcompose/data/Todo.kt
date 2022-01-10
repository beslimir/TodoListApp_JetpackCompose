package com.example.todolistapp_jetpackcompose.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val description: String?,
    val isDone: Boolean
)
