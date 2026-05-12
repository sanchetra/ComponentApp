package com.example.componentapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.componentapp.components.ButtonScreen
import com.example.componentapp.components.CardComponents
import com.example.componentapp.components.SnackBarComponents
import com.example.componentapp.components.TextFieldComponent
import com.example.componentapp.data.ComponentType
import com.example.jc_components.components.dialogsAndPopups.DialogMainScreen

@Composable
fun ComponentDetailScreen(
    component: ComponentType,
    canGoBack: Boolean,
    onBack: () -> Unit
) {
    Scaffold(
        contentWindowInsets = WindowInsets(0),
        topBar = {
            ScreenTopBar(component.title, canGoBack, onBack)
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {
            when (component) {
                ComponentType.BUTTON -> ButtonScreen()
                ComponentType.TEXT_FIELD -> TextFieldComponent()
                ComponentType.CARD -> CardComponents()
                ComponentType.DIALOG -> DialogMainScreen()
                ComponentType.SNACKBAR -> SnackBarComponents()
                // continue until 19
                else -> {}
            }
        }
    }
}