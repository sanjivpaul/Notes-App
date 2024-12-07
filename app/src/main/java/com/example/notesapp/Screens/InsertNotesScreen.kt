package com.example.notesapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notesapp.ui.theme.ColorBlack
import com.example.notesapp.ui.theme.ColorGrey
import com.example.notesapp.ui.theme.ColorLightGrey

@Composable
@Preview
fun InsertNotesScreen() {
    Scaffold(floatingActionButton = {
        FloatingActionButton(
            contentColor = Color.White,
            containerColor = Color.Green,
            shape = RoundedCornerShape(corner = CornerSize(30.dp)),
            onClick = { }) {
            Icon(imageVector = Icons.Default.Done, contentDescription = "")
        }
    }) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(ColorBlack)
        )
        {
            Column(modifier = Modifier.padding(15.dp)) {
                Text(
                    text = "Create Notes",
                    style = TextStyle(
                        fontSize = 32.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                TextField(
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = ColorGrey,
                        unfocusedContainerColor = ColorGrey,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = "Enter Title",
                            style = TextStyle(fontSize = 18.sp, color = ColorLightGrey)
                        )
                    },
                    value = "",
                    onValueChange = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(ColorGrey)
                )

                Spacer(modifier = Modifier.height(15.dp))

                TextField(
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = ColorGrey,
                        unfocusedContainerColor = ColorGrey,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = "Note...",
                            style = TextStyle(fontSize = 18.sp, color = ColorLightGrey)
                        )
                    },
                    value = "",
                    onValueChange = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.6f)
                        .background(ColorGrey)
                )
            }
        }

    }
}