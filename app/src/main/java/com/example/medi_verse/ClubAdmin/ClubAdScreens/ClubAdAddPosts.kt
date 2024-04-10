package com.example.medi_verse.ClubAdmin.ClubAdScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.medi_verse.ui.theme.BackgroundColor

@Composable
fun ClubAdAddPosts () {
    Box(modifier = Modifier.background(BackgroundColor), contentAlignment = Alignment.Center){
        Text(
            text = "Add post",
            color = Color.Black,
            modifier = Modifier .size(100.dp)
        )
    }
}