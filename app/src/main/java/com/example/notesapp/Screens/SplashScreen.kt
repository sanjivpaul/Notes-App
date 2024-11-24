package com.example.notesapp.Screens

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notesapp.R
import com.example.notesapp.ui.theme.ColorBlack

@Composable
@Preview
fun SplashScreen(modifier: Modifier=Modifier) {
//    scaffold is like base of our screen
    Scaffold {innerpadding->
        Box(modifier= Modifier
            .padding(innerpadding)
            .fillMaxSize()
            .background(color = ColorBlack)) {
Image(painterResource(id = R.drawable.logo) , contentDescription ="logo", modifier = Modifier.size(150.dp).align(Alignment.Center) )
        }

    }
}