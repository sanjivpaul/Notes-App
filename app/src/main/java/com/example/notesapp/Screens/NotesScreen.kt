import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.notesapp.Models.Notes
import com.example.notesapp.Navigation.NotesNavigationItems
import com.example.notesapp.ui.theme.ColorBlack
import com.example.notesapp.ui.theme.ColorGrey
import com.example.notesapp.ui.theme.ColorLightGrey
import com.example.notesapp.ui.theme.ColorRed

@Composable
//@Preview
fun NotesScreen(navHostController: NavHostController) {

    val notesList = listOf(
        Notes(
            title = "Meeting with Debux",
            description = "I am using Xcode to manage the profile of a simple test app. I created the project and enabled CloudKit, but wanted to use another container"
        ),
        Notes(
            title = "Meeting with team",
            description = "Always use the container view controller's API to remove or replace a presented view controller. Present a view controller modally. Use modal presentations"
        ),
        Notes(
            title = "Meeting with team",
            description = "Go through the entire list and do docker stop <containerid> or docker stop <containername> when you find it. Most likely it uses a auto-generated containername"
        ),
        Notes(
            title = "Meeting with team",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Testing 1",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Testing 2",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Meeting with team",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Meeting with team",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Meeting with team",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Meeting with team",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Testing 1",
            description = "Discuss Project RoadMap"
        ),
        Notes(
            title = "Testing 2",
            description = "Discuss Project RoadMap"
        ),
    )
    Scaffold(floatingActionButton =
    {
        FloatingActionButton(
            contentColor = Color.White,
            containerColor = Color.Green,
            shape = RoundedCornerShape(corner = CornerSize(30.dp)),
            onClick = {
                navHostController.navigate(NotesNavigationItems.InsertNotesScreen.route)

            }) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
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
//                Text is used for write the string
                Text(
                    text = "Notes",
                    style = TextStyle(
                        fontSize = 32.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                    )
                )


                LazyColumn {
                    items(notesList) { notes ->
                        ListItems(notes)
                    }
                }
            }
        }

    }
}

@Composable
@Preview
fun ListItemsPreview() {
    ListItems(notes = Notes("Hey There This is title", "Hey This is description"))
}

@Composable
fun ListItems(notes: Notes) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
//            .padding(vertical = 10.dp)
            .clip(shape = RoundedCornerShape(corner = CornerSize(10.dp)))
            .background(color = ColorGrey)
    ) {
        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "",
            tint = Color.White,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(10.dp)
        )

        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = notes.title, style = TextStyle(color = Color.White, fontSize = 18.sp))
            Text(
                text = notes.description,
                style = TextStyle(color = ColorLightGrey, fontSize = 14.sp)
            )
        }
    }
}