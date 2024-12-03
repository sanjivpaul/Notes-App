import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notesapp.Models.Notes
import com.example.notesapp.ui.theme.ColorBlack

@Composable
@Preview
fun NotesScreen() {

    val notesList = listOf(
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
    Scaffold { innerPadding ->
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
                    text = "Create Notes \n Crud",
                    style = TextStyle(
                        fontSize = 32.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )


                LazyColumn {
//                    items( )
                }
            }
        }

    }
}