package com.example.componentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.componentapp.layouts.BoxLayout
import com.example.componentapp.layouts.ColumnLayout
import com.example.componentapp.layouts.LazyColumnLayout
import com.example.componentapp.layouts.LazyHorizontalGridLayout
import com.example.componentapp.layouts.LazyRowLayout
import com.example.componentapp.layouts.LazyVerticalGridLayout
import com.example.componentapp.layouts.RowLayout
import com.example.componentapp.navigation.NavigationRoot
import com.example.componentapp.ui.theme.ComponentAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentAppTheme {
                NavigationRoot()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComponentAppTheme {
        Greeting("Android")
    }
}