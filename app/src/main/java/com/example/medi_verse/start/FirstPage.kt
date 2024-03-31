package com.example.medi_verse.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medi_verse.R

@Preview(widthDp = 384, heightDp = 630)
@Composable
fun FirstPage() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterStart,
    ){
        Image(
            painter = painterResource(id = R.drawable.img ),
            contentDescription = "Demo image",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 230.dp)
        ) {
            Text(text = "Welcome!", fontWeight = FontWeight.ExtraBold, color = Color.White.copy(.9f), fontSize = 30.sp, modifier = Modifier.padding(start = 10.dp, top = 20.dp))
            Text(text = "Share your thoughts", fontWeight = FontWeight.W300, color = Color.White.copy(.8f), fontSize = 20.sp, modifier = Modifier.padding(start = 10.dp, top = 9.dp))
            Text(text = "Connect with campus", fontWeight = FontWeight.W300, color = Color.White.copy(.8f), fontSize = 20.sp, modifier = Modifier.padding(start = 10.dp, top = 3.dp))
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(width = 190.dp, height = 80.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White,
            ),
        ) {
            Text(text = "Get Started")
        }
    }
}