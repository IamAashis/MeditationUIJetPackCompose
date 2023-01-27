package com.jetPack.meditationuijetpackcomponse.ui.util

import androidx.compose.ui.geometry.Offset
import java.lang.Math.abs
import java.nio.file.Path

/**
 * Created by Aashis on 27,January,2023
 */
class PathUtil {

    fun Path.standardQuadFromTo(from: Offset, to: Offset) {
        quadraticBezierTo(
            from.x,
            from.y,
            abs(from.x + to.x) / 2f,
            abs(from.y + to.y) / 2f
        )
    }
}