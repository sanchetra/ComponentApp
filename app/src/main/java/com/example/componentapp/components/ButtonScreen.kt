package com.example.componentapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CustomTopAppBar(title = "Button Screen")
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {},
            ) {
                Text("Filled")
            }
            FilledTonalButton(
                onClick = {}
            ) {
                Text("Tonal")
            }
            OutlinedButton(
                onClick = {}
            ) {
                Text("Outlined")
            }
            ElevatedButton(
                onClick = {}
            ) {
                Text("Elevated")
            }
            TextButton(
                onClick = {}
            ) {
                Text("Text button")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButton(modifier: Modifier = Modifier) {
    ButtonScreen()
}