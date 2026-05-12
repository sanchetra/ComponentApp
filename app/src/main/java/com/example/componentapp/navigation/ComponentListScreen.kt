package com.example.componentapp.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.componentapp.data.ComponentType

@Composable
fun ComponentListScreen(onItemClick: (ComponentType) -> Unit) {

    val components = ComponentType.entries

    LazyColumn {
        items(components) { component ->
            ListItem(
                headlineContent = { Text("Component $component") },
                modifier = Modifier.clickable { onItemClick(component) }
            )
        }
    }
}