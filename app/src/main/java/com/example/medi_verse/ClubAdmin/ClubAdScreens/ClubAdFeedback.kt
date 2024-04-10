package com.example.medi_verse.ClubAdmin.ClubAdScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medi_verse.ui.theme.BackgroundColor

@Preview(widthDp = 250, heightDp = 500)
@Composable
fun ClubAdFeedback() {
    Box(modifier = Modifier.background(BackgroundColor), contentAlignment = Alignment.Center){
        Text(
            text = "FeedBack",
            color = Color.Black,
            modifier = Modifier .size(100.dp)
        )
    }
}