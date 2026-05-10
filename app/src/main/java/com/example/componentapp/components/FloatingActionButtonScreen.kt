package com.example.componentapp.components

import android.R.attr.onClick
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FloatingActionButtonScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CustomTopAppBar(title = "Floating Action Button")
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
            ) {
                Icon(Icons.Filled.Add, "Floating action button.")
            }
        }

    ) { innerPadding ->

    }
}
@Preview(showBackground = false)
@Composable
fun PreviewFloatingActionButton(modifier: Modifier = Modifier) {
    FloatingActionButtonScreen()
}