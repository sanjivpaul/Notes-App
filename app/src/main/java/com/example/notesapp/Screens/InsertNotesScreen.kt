package com.example.notesapp.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun InsetNotesScreen() {
    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding))
        {

        }

    }
}