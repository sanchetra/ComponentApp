package com.example.componentapp.layouts

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp
import com.example.componentapp.components.CustomTopAppBar

@Composable
fun LazyColumnLayout(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CustomTopAppBar(title = "LazyColumn")
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            itemsIndexed(users) { index, user ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.LightGray, shape = RoundedCornerShape(4.dp)).height(40.dp).padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("$index - ${user.name}", color = MaterialTheme.colorScheme.primary)
                }

            }
        }
    }
}

data class User(
    val name: String,
    val age: Int,
)

val users = listOf(
    User("John", 25),
    User("Sara", 30),
    User("Mike", 22),
    User("John", 25),
    User("Sara", 30),
    User("Mike", 22),
    User("Sara", 30),
    User("Mike", 22),
    User("Sara", 30),
    User("Mike", 22),
    User("Sara", 30),
    User("Mike", 22),
    User("John", 25),
    User("Sara", 30),
    User("Mike", 22),
    User("John", 25),
    User("Sara", 30),
    User("Mike", 22),
)