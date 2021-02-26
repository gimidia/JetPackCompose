package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun NewsStory() {

    MaterialTheme{
        val typography =MaterialTheme.typography
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            ImageHeader()
            Spacer(Modifier.preferredHeight(16.dp))
            Text("Outono", style = typography.body2)
            Text("Inverno", style = typography.body2)
            Text("Primavera", style = typography.body2)
            Text("Verão", style = typography.h6)
            Counter()
        }
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    NewsStory()
                }
            }
        }
    }
}

@Composable
fun Counter() {
    val count = remember { mutableStateOf(0) }
    Button(onClick = { count.value++ }) {
        Text("'Cliques' ${count.value} tempos")
    }
}
@Composable
fun ImageHeader(){
    val image = imageResource(R.drawable.header)
    val imageModifier = Modifier
        .preferredHeight(180.dp)
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(20.dp))

    Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
}

@Composable
fun ScoreView(score: Score){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Parou Aqui
        Row(
        modifier = Modifier.padding(bottom = 16.dp)
        ) {

        }
    }



    Button(
        onClick = {
            score.homeScore = 0
            score.visitorScore = 0

        }) {
        Text("Reset")
    }
        

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        NewsStory()

    }
}
