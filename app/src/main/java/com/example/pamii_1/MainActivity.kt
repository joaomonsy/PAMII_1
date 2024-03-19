package com.example.pamii_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.pamii_1.ui.theme.PAMII_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMII_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Inicial()
                }
            }
        }
    }
}

@Composable
fun TextoCustomizado (texto: String){
    Text(text = texto, color = Color.White)
}

@Composable
fun Inicial() {
    Column(modifier = Modifier.background(color = Color.Blue)) {
        TextoCustomizado(texto = "Terceira aula")
        Row {
            TextoCustomizado(texto = "Android Studio")
            TextoCustomizado(texto = "JetPack Compose")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Palmeiras $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAMII_1Theme {
        Greeting("Android")
    }
}