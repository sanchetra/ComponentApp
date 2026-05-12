package com.example.componentapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration

@Composable
fun ComponentNavGraph() {

    val backStack = rememberNavBackStack(
        configuration = SavedStateConfiguration { serializersModule = navModule },
        ComponentList
    )

    val canGoBack = backStack.size > 1

    NavDisplay(
        backStack = backStack,
        entryProvider = { key ->
            when (key) {

                is ComponentList -> NavEntry(key) {
                    ComponentListScreen(
                        onItemClick = { component ->
                            backStack.add(ComponentDetail(component))
                        }
                    )
                }

                is ComponentDetail -> NavEntry(key) {
                    ComponentDetailScreen(
                        component = key.component,
                        canGoBack = canGoBack,
                        onBack = { backStack.removeLastOrNull() }
                    )
                }

                else -> error("Unknown Component route")
            }
        }
    )
}