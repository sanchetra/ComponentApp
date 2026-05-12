package com.example.componentapp.navigation

import androidx.navigation3.runtime.NavKey
import com.example.componentapp.data.ComponentType
import com.example.componentapp.data.LayoutType
import kotlinx.serialization.Serializable

@Serializable
sealed interface Route : NavKey {

}

@Serializable
data object HomeRoot : Route

@Serializable
data object ComponentRoot : Route

@Serializable
data object EmptyScreen : Route

@Serializable
data object HomeScreen : Route

@Serializable
data class LayoutDetail(val layout: LayoutType) : Route

@Serializable
data object ComponentList : Route

@Serializable
data class ComponentDetail(val component: ComponentType) : Route