package com.example.componentapp.components

import android.graphics.drawable.Icon
import android.media.Image
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(
    modifier: Modifier = Modifier,
    title: String,
    navigationIcon: ImageVector? = null,
    actions: ImageVector? = null,
    onNavigationClick: (() -> Unit)? = null,
    onActionClick: (() -> Unit)? = null,
    containerColor: Color = MaterialTheme.colorScheme.primaryContainer,
    titleContentColor: Color = MaterialTheme.colorScheme.primary,
    navigationIconContentColor: Color = MaterialTheme.colorScheme.primary,
    actionIconContentColor: Color = Color.White
) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = containerColor,
            titleContentColor = titleContentColor,
            navigationIconContentColor = navigationIconContentColor,
            actionIconContentColor = actionIconContentColor
        ),
        title = {
            Text(title)
        },
        navigationIcon = {
            if (navigationIcon != null && onNavigationClick != null) {
                IconButton(onClick = onNavigationClick) {
                    Icon(
                        imageVector = navigationIcon,
                        contentDescription = null
                    )
                }
            }
        },
        actions = {
            if (actions != null && onActionClick != null) {
                IconButton(onClick = onActionClick) {
                    Icon(
                        imageVector = actions,
                        contentDescription = null,
                    )
                }
            }
        }
    )

}