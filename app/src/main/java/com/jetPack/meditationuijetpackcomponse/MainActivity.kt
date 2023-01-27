package com.jetPack.meditationuijetpackcomponse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jetPack.meditationuijetpackcomponse.ui.HomeScreen
import com.jetPack.meditationuijetpackcomponse.ui.theme.MeditationUIJetPackCompose

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIJetPackCompose {
                HomeScreen()
            }
        }
    }
}
