package com.example.componentapp.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.componentapp.components.CustomTopAppBar

@Composable
fun ColumnLayout(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CustomTopAppBar(title = "Column")
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.size(400.dp).background(color = Color.LightGray).padding(16.dp),
                verticalArrangement = Arrangement.SpaceAround

            ) {
                for (i in 1..5) {
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .background(
                                color = MaterialTheme.colorScheme.primary,
                                shape = RoundedCornerShape(4.dp)
                            ).size(50.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("</>", color = Color.White)
                    }
                }

            }

        }
    }

}