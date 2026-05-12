package com.example.componentapp.navigation

import android.util.Log.i
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.componentapp.data.LayoutType

@Composable
fun HomeScreenUI(onLayoutClick: (LayoutType) -> Unit) {

        val layouts = LayoutType.entries

        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(layouts) { layout ->
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable { onLayoutClick(layout) }
                ) {
                    Box(Modifier.padding(32.dp)) {
                        Text(layout.title)
                    }
                }
            }
        }

}