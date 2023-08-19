package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          var str by remember { mutableStateOf("Android")}
          Box {
            Greeting(str, onClick = { str = "ボタンがタップされました" })
          }
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String,
             onClick: ()-> Unit = {},
             modifier: Modifier = Modifier) {
  Button(onClick = onClick) {
    Text(
      text = "Hello $name!", modifier = modifier
    )
  }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  MyApplicationTheme {
    var str by remember { mutableStateOf("Android")}
    Box {
      Greeting(str, onClick = { str = "ボタンがタップされました" })
    }
  }
}