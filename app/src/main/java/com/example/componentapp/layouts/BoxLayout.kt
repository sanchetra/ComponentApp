package com.example.componentapp.layouts

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.componentapp.R
import com.example.componentapp.components.CustomTopAppBar


@Composable
fun BoxLayout(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CustomTopAppBar(title = "Box Layout")
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.size(250.dp).background(color = Color.LightGray).padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(4.dp)
                        ).size(100.dp).align(Alignment.TopStart),
                )
                Box(
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(4.dp)
                        ).size(100.dp).align(Alignment.BottomEnd),
                )
                Box(
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colorScheme.primaryContainer,
                            shape = RoundedCornerShape(4.dp)
                        ).size(120.dp).align(Alignment.Center),
                    contentAlignment = Alignment.Center
                ) {
                    Text("</>")
                }
            }
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth(0.5f)
//                    .padding(16.dp),
//                shape = RoundedCornerShape(16.dp),
//                elevation = CardDefaults.cardElevation(
//                    defaultElevation = 16.dp
//                ),
//            ) {
//                Box(modifier = Modifier.height(300.dp)) {
//                    Image(
//                        modifier = Modifier.fillMaxSize(),
//                        painter = painterResource(R.drawable.eminem),
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop
//                    )
//                    Box(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(
//                                Brush.verticalGradient(
//                                    colors = listOf(
//                                        Color.Transparent,
//                                        Color.Black
//                                    ),
//                                    startY = 300f
//                                )
//                            )
//                    )
//                    Box(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(12.dp),
//                        contentAlignment = Alignment.BottomStart
//                    ) {
//                        Text(
//                            text = "Eminem The Rap God",
//                            style = TextStyle(color = Color.White, fontSize = 15.sp)
//                        )
//                    }
//                }
//
//            }

        }
    }
}