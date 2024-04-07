package com.example.medi_verse.Student.Screens

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Tab
import androidx.compose.material.TabPosition
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.contentColorFor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Feedback() {
    val pagerState = rememberPagerState()
    val pages = listOf("Campus","Clubs","Others")
    val defaultIndicator = @Composable { tabPositions: List<TabPosition> ->
        TabRowDefaults.Indicator(
            Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
        )
    }
    val indicator = @Composable { tabPositions: List<TabPosition> ->
        CustomIndicator(tabPositions, pagerState)
    }
    Column {
            Text(
                text = "Feedback",
                color = Color(0xFF134074),
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            )
            ScrollableTabRow(
                selectedTabIndex = pagerState.currentPage,
                indicator = indicator,
                backgroundColor = Color(0xFF8DA9C4),
                contentColor = contentColorFor(backgroundColor)

            ) {
                pages.forEachIndexed { index, title ->
                    Tab(
                        modifier = Modifier.zIndex(6f),
                        text = { Text(text = title) },
                        selected = pagerState.currentPage == index,
                        onClick = { /* TODO */ },
                    )
                }
            }
            HorizontalPager(
                modifier = Modifier.fillMaxSize().background(Color(0xFFEDF2FB)),
                count = pages.size,
                state = pagerState,
            ) { page ->
                Box(Modifier.fillMaxSize()) {
                    var textContent=""
                    if (page==0){
                        textContent="Hi send your campus related suggestion here"
                    }
                    if (page==1){
                        textContent="Hi send your club related suggestion here"
                    }
                    if (page==2){
                        textContent="Hi send your other suggestion here"
                    }
                    Text(modifier = Modifier.align(Alignment.Center), text = textContent)
                }
            }
        }
}
@OptIn(ExperimentalPagerApi::class)
@Composable
private fun CustomIndicator(tabPositions: List<TabPosition>, pagerState: PagerState) {
    val transition = updateTransition(pagerState.currentPage, label = "")
    val indicatorStart by transition.animateDp(
        transitionSpec = {
            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 50f)
            } else {
                spring(dampingRatio = 1f, stiffness = 1000f)
            }
        }, label = ""
    ) {
        tabPositions[it].left
    }

    val indicatorEnd by transition.animateDp(
        transitionSpec = {
            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 1000f)
            } else {
                spring(dampingRatio = 1f, stiffness = 50f)
            }
        }, label = ""
    ) {
        tabPositions[it].right
    }

    Box(
        Modifier
            .offset(x = indicatorStart)
            .wrapContentSize(align = Alignment.BottomStart)
            .width(indicatorEnd - indicatorStart)
            .padding(2.dp)
            .fillMaxSize()
            .background(color = Color.White, RoundedCornerShape(50))
            .zIndex(1f)
    )
}
