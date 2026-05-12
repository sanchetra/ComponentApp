package com.example.componentapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.componentapp.data.LayoutType
import com.example.componentapp.layouts.BoxLayout
import com.example.componentapp.layouts.ColumnLayout
import com.example.componentapp.layouts.LazyColumnLayout
import com.example.componentapp.layouts.LazyVerticalGridLayout
import com.example.componentapp.layouts.RowLayout


@Composable
fun LayoutDetailScreen(
    layout: LayoutType,
    canGoBack: Boolean,
    onBack: () -> Unit
) {
    Scaffold(
        contentWindowInsets = WindowInsets(0,0,0,0),
        topBar = {
            ScreenTopBar(layout.title, canGoBack, onBack)
        }
    ) { innerPadding ->
        Box(Modifier.padding(innerPadding)) {
            when (layout) {
                LayoutType.BOX -> BoxLayout()
                LayoutType.COLUMN -> ColumnLayout()
                LayoutType.ROW -> RowLayout()
                LayoutType.LAZY_COLUMN -> LazyColumnLayout()
                LayoutType.LAZY_VER_GRID -> LazyVerticalGridLayout()
                LayoutType.LAZY_HOR_GRID -> LazyVerticalGridLayout()
            }
        }
    }

}