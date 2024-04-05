package com.example.medi_verse.Student

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardType1(newsimg: Int, headingnews: String, subnews: String,clubname:String) {
    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)) {
        Row(
            Modifier.background(Color.White),
            verticalAlignment =Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = newsimg), contentDescription = "", modifier = Modifier.size(55.dp,55.dp).padding(8.dp).clip(shape = RoundedCornerShape(8.dp)))
            Column(modifier = Modifier.weight(.8f)) {
                Text(
                    text = clubname, fontWeight = FontWeight.Thin, color = Color.Black,
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(
                    text = headingnews, fontWeight = FontWeight.W100, color = Color.Black,
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = subnews, fontWeight = FontWeight.W300, color = Color.Black,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}
