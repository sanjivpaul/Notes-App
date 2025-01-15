package com.example.notesapp.Models

data class Notes(
    val title: String,
    val description: String
)

fun getFakeTodo(): List<Notes> {
    return listOf<Notes>(

    )
}
