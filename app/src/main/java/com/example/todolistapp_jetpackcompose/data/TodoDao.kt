package com.example.todolistapp_jetpackcompose.data

interface TodoDao {

    suspend fun insertTodo(todo: Todo)

}