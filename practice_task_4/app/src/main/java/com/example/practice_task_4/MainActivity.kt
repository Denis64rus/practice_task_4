package com.example.practice_task_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practice_task_4.ui.theme.Practice_task_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice_task_4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {


    class herbivores(_weight: Double, _color: String) {

        var weight: Double = _weight
        var color: String = _color

        fun info() {

            println(weight)
            println(color)

        }

    }

    class carnivores(_weight: Double, _color: String) {

        var weight: Double = _weight
        var color: String =_color

        fun info() {

            println(weight)
            println(color)

        }

    }

    var panda: herbivores = herbivores(255.5,"black and white")
    var horse: herbivores = herbivores(100.45,"brown")

    var wolf: carnivores = carnivores(60.8,"grey")
    var fox: carnivores = carnivores(40.2,"red")

    val animals = listOf(panda, horse, wolf, fox)

    for(animal in animals) {

        println(animal)

    }


    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practice_task_4Theme {
        Greeting("Android")
    }
}