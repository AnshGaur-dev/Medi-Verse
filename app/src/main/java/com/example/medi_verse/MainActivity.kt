package com.example.medi_verse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.medi_verse.Student.MainScreen
import com.example.medi_verse.Student.Screens.Announcements

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainScreen(this)
        }
    }
}
