package com.example.notesapp.Navigation

import NotesScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notesapp.Screens.InsertNotesScreen
import com.example.notesapp.Screens.SplashScreen

@Composable
fun NotesNavigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "splash")
    {
        composable(NotesNavigationItems.SplashScreen.route) {
            SplashScreen(navHostController)
        }

        composable(NotesNavigationItems.HomeScreen.route) {
            NotesScreen(navHostController)
        }

        composable(NotesNavigationItems.InsertNotesScreen.route) {
            InsertNotesScreen()
        }
    }

}