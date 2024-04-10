package com.example.medi_verse.ClubAdmin.ClubAdScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medi_verse.R
import com.example.medi_verse.Student.StScreens.AnnoucementLayout
import com.example.medi_verse.Student.StScreens.AnnoucementsCustomDatatype
import com.example.medi_verse.Student.StScreens.AnnoucementsDataList
import com.example.medi_verse.ui.theme.BackgroundColor

@Preview(widthDp = 250, heightDp = 500)
@Composable
fun ClubAdFeedback() {
    Box(modifier = Modifier
        .background(BackgroundColor)
        .fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(Modifier.fillMaxSize()) {
            Text(
                text = "FeedBacks",
                color = Color(0xFF134074),
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            )
            val items: List<FeedbackCustomDatatype> = FeedbackDatalist()
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                modifier = Modifier.fillMaxSize().padding(bottom = 36.dp),
                contentPadding = PaddingValues(16.dp),
                verticalItemSpacing = 16.dp,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                this.items(items) { item ->
                    FeedbackLayout(item = item)
                }
            }
        }
    }
}

@Composable
fun FeedbackLayout(item: FeedbackCustomDatatype) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            Modifier.background(Color.White),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = item.img),
                contentDescription = "",
                modifier = Modifier
                    .size(55.dp)
                    .padding(8.dp)
                    .clip(CircleShape)
                    .border(1.dp, Color.Black, CircleShape)
                    .weight(.2f)
            )
            Column(modifier = Modifier.weight(.5f)) {
                Text(
                    text = item.feedback, fontWeight = FontWeight.W300, color = Color.Black,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

data class FeedbackCustomDatatype (val img:Int,val feedback:String)
fun FeedbackDatalist(): MutableList<FeedbackCustomDatatype> {
    val list = mutableListOf<FeedbackCustomDatatype>()
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Assess member participation and brainstorm interactive events to boost engagement."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Ensure opportunities for learning new tech skills through tutorials or study groups."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Encourage teamwork on projects and coding challenges."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Facilitate connections with industry pros through guest speakers or career panels"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Establish a system for gathering member input and making improvements"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Plan for the club's long-term success and continuity"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Encourage participation in external events and conferences."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Assess member participation and brainstorm interactive events to boost engagement."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Ensure opportunities for learning new tech skills through tutorials or study groups."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Encourage teamwork on projects and coding challenges."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Facilitate connections with industry pros through guest speakers or career panels"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Establish a system for gathering member input and making improvements"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Plan for the club's long-term success and continuity"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Encourage participation in external events and conferences."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Assess member participation and brainstorm interactive events to boost engagement."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Ensure opportunities for learning new tech skills through tutorials or study groups."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Encourage teamwork on projects and coding challenges."))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Facilitate connections with industry pros through guest speakers or career panels"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Establish a system for gathering member input and making improvements"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Plan for the club's long-term success and continuity"))
    list.add(FeedbackCustomDatatype(R.drawable.annoucementshumanpic,"Encourage participation in external events and conferences."))
    return list
}
