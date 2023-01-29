package com.jetPack.meditationuijetpackcomponse.ui.util

import androidx.compose.ui.geometry.Offset

/**
 * Created by Aashis on 1/29/2023.
 */
fun androidx.compose.ui.graphics.Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        Math.abs(from.x + to.x) / 2f,
        Math.abs(from.y + to.y) / 2f
    )
}