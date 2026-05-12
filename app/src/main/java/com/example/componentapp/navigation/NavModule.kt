package com.example.componentapp.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val navModule = SerializersModule {
    polymorphic(NavKey::class) {
        subclass(HomeRoot::class, HomeRoot.serializer())
        subclass(ComponentRoot::class, ComponentRoot.serializer())
        subclass(EmptyScreen::class, EmptyScreen.serializer())

        subclass(HomeScreen::class, HomeScreen.serializer())
        subclass(LayoutDetail::class, LayoutDetail.serializer())

        subclass(ComponentList::class, ComponentList.serializer())
        subclass(ComponentDetail::class, ComponentDetail.serializer())
    }
}