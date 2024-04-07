package com.example.medi_verse.Student.Screens

import android.annotation.SuppressLint
import android.widget.EditText
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.android.volley.toolbox.ImageRequest

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn( ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Preview(widthDp = 384, heightDp = 630)
@Composable
fun Home() {
    val horizontalPagerState = rememberPagerState(pageCount = { HomeDataList().size })
    Box(modifier = Modifier
        .background(Color(0xFFEDF2FB))
        .fillMaxSize()){
        Column(Modifier.fillMaxSize()) {
            Text(
                text = "Medi-verse",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            )
        Scaffold(
            modifier = Modifier,
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = Color(0xFFEDF2FB),
                        ),
                    title = {
                            val uservalue= remember { mutableStateOf("") }
                            TextField(
                                value = uservalue.value,
                                onValueChange = {
                                    uservalue.value = it
                                },
                                label = { Text(text = "Search") },
                                colors = TextFieldDefaults.textFieldColors(cursorColor = Color.Black,
                                unfocusedLabelColor = Color.Black,
                                focusedLabelColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedTextColor = Color.Black,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                containerColor = Color.White,
                            ),
                                textStyle = TextStyle(color = Color.Black),
                                shape = RoundedCornerShape(12.dp),
                            )

                    },
                    navigationIcon = {
                        IconButton(onClick = { /*ADD SIDE DRAWER */ }) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu Icon",tint = Color.Black)
                        }
                    },
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Notifications, contentDescription = "Search Icon", tint = Color.Black)
                        }
                    }
                )
            }
        ){
            HorizontalPager(
            state = horizontalPagerState,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 60.dp)
                .background(Color(0xFFEDF2FB))
        ) { pageIndex ->
            val currentItem = HomeDataList()[pageIndex]
            HomeLayout(
                imageUrl = currentItem.img,
                title = currentItem.title,
                subtitle = currentItem.subtitle
            )
        }
        }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeLayout(
    imageUrl: String,
    title: String,
    subtitle: String
) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .fillMaxSize(),
            model = coil.request.ImageRequest.Builder(LocalContext.current)
                .data(imageUrl).build(),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Text(
            text = title,
            color = Color(0xFF134074),
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth()
        )

        Text(
            text = subtitle,
            color = Color(0xFF13315C),
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Thin,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 150.dp, start = 5.dp, end = 5.dp)
                .fillMaxWidth()
        )
    }
}


data class HomeCustomDatatype(val img:String,val title:String,val subtitle:String)
fun HomeDataList(): MutableList<HomeCustomDatatype> {
    val list = mutableListOf<HomeCustomDatatype>()
    list.add(HomeCustomDatatype("https://images.pexels.com/photos/5109665/pexels-photo-5109665.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Beaches","Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory experiences create an atmosphere unlike any other.Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory e"))
    list.add(HomeCustomDatatype("https://images.pexels.com/photos/17920141/pexels-photo-17920141/free-photo-of-man-on-paddle-board-on-sea-shore.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Surfing","Surfing is a thrilling water sport that involves riding ocean waves on a surfboard. It's a unique blend of athleticism, balance, and connection with nature. Here's a deeper dive into the world of surfing:Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory e"))
    list.add(HomeCustomDatatype("https://images.pexels.com/photos/16333679/pexels-photo-16333679/free-photo-of-boats-in-a-small-marina-with-houses-in-the-background.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Houses","Houses are more than just structures; they are shelters, havens, and reflections of the societies that build them. Throughout history, houses have served as essential elements of human civilization, providing protection, fostering communities, and shaping our understanding of home.Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory e"))
    return list

}
//package com.example.medi_verse.Student.Screens
// import android.annotation.SuppressLint
// import androidx.compose.foundation.ExperimentalFoundationApi
// import androidx.compose.foundation.background
// import androidx.compose.foundation.border
// import androidx.compose.foundation.layout.Box
// import androidx.compose.foundation.layout.Column
// import androidx.compose.foundation.layout.fillMaxHeight
// import androidx.compose.foundation.layout.fillMaxSize
// import androidx.compose.foundation.layout.fillMaxWidth
// import androidx.compose.foundation.layout.padding
// import androidx.compose.foundation.pager.HorizontalPager
// import androidx.compose.foundation.pager.rememberPagerState
// import androidx.compose.foundation.rememberScrollState
// import androidx.compose.foundation.shape.RoundedCornerShape
// import androidx.compose.foundation.verticalScroll
// import androidx.compose.material.icons.Icons
// import androidx.compose.material.icons.filled.Menu
// import androidx.compose.material.icons.filled.Notifications
// import androidx.compose.material.icons.filled.Search
// import androidx.compose.material3.ExperimentalMaterial3Api
// import androidx.compose.material3.Icon
// import androidx.compose.material3.IconButton
// import androidx.compose.material3.Scaffold
// import androidx.compose.material3.Text
// import androidx.compose.material3.TopAppBar
// import androidx.compose.material3.TopAppBarDefaults
// import androidx.compose.runtime.Composable
// import androidx.compose.ui.Modifier
// import androidx.compose.ui.draw.clip
// import androidx.compose.ui.graphics.Color
// import androidx.compose.ui.layout.ContentScale
// import androidx.compose.ui.platform.LocalContext
// import androidx.compose.ui.text.font.FontFamily
// import androidx.compose.ui.text.font.FontWeight
// import androidx.compose.ui.text.style.TextAlign
// import androidx.compose.ui.tooling.preview.Preview
// import androidx.compose.ui.unit.dp
// import androidx.compose.ui.unit.sp
// import coil.compose.AsyncImage
// import com.android.volley.toolbox.ImageRequest


// @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
// @OptIn( ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
// @Preview(widthDp = 384, heightDp = 630)
// @Composable
// fun Home() {
//     val horizontalPagerState = rememberPagerState(pageCount = { HomeDataList().size })

//     Box(modifier = Modifier.background(Color(0xFFEDF2FB)).fillMaxSize()){
//         Column(Modifier.fillMaxSize()) {
//             Text(
//                 text = "Medi-verse",
//                 color = Color.Black,
//                 fontSize = 30.sp,
//                 fontFamily = FontFamily.Serif,
//                 fontWeight = FontWeight.Bold,
//                 textAlign = TextAlign.Center,
//                 modifier = Modifier
//                     .fillMaxWidth()
//                     .padding(top = 15.dp)
//             )
//         Scaffold(
//             modifier = Modifier.padding(top = 70.dp),
//             topBar = {
//                 TopAppBar(
//                     colors = TopAppBarDefaults.smallTopAppBarColors(
//                         containerColor = Color.White
//                     ),
//                     title = { /* Leave this empty */},
//                     navigationIcon = {
//                         IconButton(onClick = { /*TODO*/ }) {
//                             Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu Icon")
//                         }
//                     },
//                     actions = {
//                         IconButton(onClick = { /*TODO*/ }) {
//                             Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
//                         }
//                         IconButton(onClick = { /*TODO*/ }) {
//                             Icon(imageVector = Icons.Default.Notifications, contentDescription = "Search Icon")
//                         }
//                     }
//                 )
//             }
//         ){}

//             HorizontalPager(
//                 state = horizontalPagerState,
//                 modifier = Modifier.fillMaxSize()
//             ) { pageIndex ->
//                 val currentItem = HomeDataList()[pageIndex]
//                 HomeLayout(
//                     imageUrl = currentItem.img,
//                     title = currentItem.title,
//                     subtitle = currentItem.subtitle
//                 )
//             }
//         }
//     }
// }
// @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
// @Composable
// fun HomeLayout(
//     imageUrl: String,
//     title: String,
//     subtitle: String
// ) {
//     Column(
//         modifier = Modifier
//             .verticalScroll(rememberScrollState())
//             .fillMaxSize()
//     ) {
//         AsyncImage(
//             modifier = Modifier
//                 .fillMaxHeight()
//                 .padding(16.dp)
//                 .clip(RoundedCornerShape(16.dp))
//                 .fillMaxSize(),
//             model = coil.request.ImageRequest.Builder(LocalContext.current)
//                 .data(imageUrl).build(),
//             contentDescription = null,
//             contentScale = ContentScale.Crop
//         )

//         Text(
//             text = title,
//             color = Color(0xFF134074),
//             fontSize = 30.sp,
//             fontFamily = FontFamily.Serif,
//             fontWeight = FontWeight.SemiBold,
//             textAlign = TextAlign.Center,
//             modifier = Modifier
//                 .padding(top = 10.dp)
//                 .fillMaxWidth()
//         )

//         Text(
//             text = subtitle,
//             color = Color(0xFF13315C),
//             fontSize = 20.sp,
//             fontFamily = FontFamily.Serif,
//             fontWeight = FontWeight.Thin,
//             textAlign = TextAlign.Center,
//             modifier = Modifier
//                 .padding(top = 10.dp, bottom = 150.dp, start = 5.dp, end = 5.dp)
//                 .fillMaxWidth()
//         )
//     }
// }


// data class HomeCustomDatatype(val img:String,val title:String,val subtitle:String)
// fun HomeDataList(): MutableList<HomeCustomDatatype> {
//     val list = mutableListOf<HomeCustomDatatype>()
//     list.add(HomeCustomDatatype("https://images.pexels.com/photos/5109665/pexels-photo-5109665.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Beaches","Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory experiences create an atmosphere unlike any other.Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory e"))
//     list.add(HomeCustomDatatype("https://images.pexels.com/photos/17920141/pexels-photo-17920141/free-photo-of-man-on-paddle-board-on-sea-shore.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Surfing","Surfing is a thrilling water sport that involves riding ocean waves on a surfboard. It's a unique blend of athleticism, balance, and connection with nature. Here's a deeper dive into the world of surfing:Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory e"))
//     list.add(HomeCustomDatatype("https://images.pexels.com/photos/16333679/pexels-photo-16333679/free-photo-of-boats-in-a-small-marina-with-houses-in-the-background.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Houses","Houses are more than just structures; they are shelters, havens, and reflections of the societies that build them. Throughout history, houses have served as essential elements of human civilization, providing protection, fostering communities, and shaping our understanding of home.Beaches hold a special place in our hearts. They are ribbons of sand bordering vast expanses of water, beckoning us with promises of relaxation, adventure, and a connection to nature's raw beauty. The rhythmic crash of waves, the caress of warm sand on bare feet, and the salty tang in the air – these sensory e"))
//     return list

// }