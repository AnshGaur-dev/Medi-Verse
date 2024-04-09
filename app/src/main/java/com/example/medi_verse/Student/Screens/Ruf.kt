package com.example.medi_verse.Student.Screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.medi_verse.R
import com.example.medi_verse.ui.theme.BackgroundColor

@Preview
@Composable
fun DrawerContent() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(BackgroundColor)){
        Column(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.background(Color.White), contentAlignment = Alignment.BottomCenter) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.boy),
                        contentDescription = "",
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    var name = "Noah Walker"
                    val email="NoahWalker02@gmail.com"
                    Text(
                        text = "$name",
                        color = Color(0xFF13315C),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    Text(
                        text = "$email",
                        color = Color(0xFF13315C),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, end = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(imageVector = Icons.Default.Share, contentDescription = "Share app")
                Text(
                    text = "Share",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 10.dp)
                )}
            Row(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(imageVector = Icons.Default.Phone, contentDescription = "Share app")
                Text(
                    text = "Contact us",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 10.dp)
                )}
            Row(
                modifier = Modifier
                    .padding(top = 60.dp,end = 28.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(imageVector = Icons.Default.ExitToApp, contentDescription = "Share app")
                Text(
                    text = "Sign out",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 10.dp)
                )}

        }
    }
}