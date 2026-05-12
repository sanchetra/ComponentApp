package com.example.jc_components.components.dialogsAndPopups

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.componentapp.components.CustomTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogMainScreen() {
    Scaffold(
        topBar = {
            CustomTopAppBar(title = "Dialog Components")
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            BasicDialogs()
            Spacer(Modifier.height(16.dp))
            CardDialog()
            Spacer(Modifier.height(16.dp))
            FullScreenDialog()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDialog() {
    DialogMainScreen()
}
