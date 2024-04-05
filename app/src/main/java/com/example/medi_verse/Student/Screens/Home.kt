package com.example.medi_verse.Student.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medi_verse.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(widthDp = 384, heightDp = 630)
@Composable
fun Home() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(
            text = "Medi-Verse",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        )

            Scaffold(
                modifier = Modifier.padding(top = 70.dp),
                topBar = {
                    TopAppBar(
                        colors = TopAppBarDefaults.smallTopAppBarColors(
                            containerColor = Color.White
                        ),
                        title = { /* Leave this empty */},
                        navigationIcon = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu Icon")
                            }
                        },
                        actions = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Notifications, contentDescription = "Search Icon")
                            }
                        }
                    )
                }
            ) {
                Text(text = "Current Updates",color = Color.Black,
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Serif,fontWeight = FontWeight.W200, modifier = Modifier.padding(start = 17.dp, top = 80.dp))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 100.dp)) {
                    Card(
                        modifier = Modifier
                            .padding(top = 10.dp, start = 10.dp)
                            .size(height = 150.dp, width = 210.dp),
                        shape = RoundedCornerShape(12.dp),
                    ) {
                    }
                    Card(
                        modifier = Modifier
                            .padding(top = 10.dp, start = 10.dp)
                            .size(height = 150.dp, width = 210.dp),
                        shape = RoundedCornerShape(12.dp),
                    ) {

                    }
                    Card(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .size(height = 150.dp, width = 210.dp),
                        shape = RoundedCornerShape(12.dp),
                    ) {

                    }
                }
                Text(text = "Recommendation",fontSize = 22.sp,fontFamily = FontFamily.Serif,fontWeight = FontWeight.W200, modifier = Modifier.padding(top = 270.dp))
                Spacer(modifier = Modifier.padding(4.dp))
                Column (modifier = Modifier){
                    Box(modifier = Modifier
                        .background(Color(0xFFEEEEEE))
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                    )
                    Text(text = "ewfewecommendationssssss",fontSize = 22.sp,fontFamily = FontFamily.Serif,fontWeight = FontWeight.W200)
                    LazyColumn{
                        item (getDatalist().size){

                        }
                    }
                }
            }
    }
}
data class CardDataType(val newsimg: Int,val headingnews: String,val subnews: String,val clubname:String)
fun getDatalist():MutableList<CardDataType>{
    val list = mutableListOf<CardDataType>()
    list.add(CardDataType(R.drawable.wittyhacks,"Hackathon","Hack is live","ACM"))
    list.add(CardDataType(R.drawable.wittyhacks,"Hackathon","Hack is live","ACM"))

    return list

}