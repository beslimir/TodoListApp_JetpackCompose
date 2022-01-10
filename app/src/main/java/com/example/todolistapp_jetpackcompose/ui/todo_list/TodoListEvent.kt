package com.example.todolistapp_jetpackcompose.ui.todo_list

import com.example.todolistapp_jetpackcompose.data.Todo

sealed class TodoListEvent {

    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent() //if we want to toggle it
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
