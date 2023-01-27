package com.jetPack.meditationuijetpackcomponse.ui.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

/**
 * Created by Aashis on 27,January,2023
 */
data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
