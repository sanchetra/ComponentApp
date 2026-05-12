package com.example.componentapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration

@Composable
fun HomeNavGraph(modifier: Modifier = Modifier) {

    val backStack = rememberNavBackStack(
        configuration = SavedStateConfiguration { serializersModule = navModule },
        HomeScreen
    )
    val canGoBack = backStack.size > 1

    NavDisplay(
        backStack = backStack,
        entryDecorators = listOf(
            rememberSaveableStateHolderNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator(),
        ),
        entryProvider = { key ->
            when (key) {

                is HomeScreen -> NavEntry(key) {
                    Box {
                        HomeScreenUI(
                            onLayoutClick = { layout ->
                                backStack.add(LayoutDetail(layout))
                            }
                        )
                    }
                }

                is LayoutDetail -> NavEntry(key) {
                    LayoutDetailScreen(
                        layout = key.layout,
                        canGoBack = canGoBack,
                        onBack = { backStack.removeLastOrNull() }
                    )
                }

                else -> error("Unknown Home route")
            }
        }
    )
}
