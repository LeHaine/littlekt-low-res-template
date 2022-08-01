package com.lehaine.game

import com.lehaine.littlekt.createLittleKtApp
import com.lehaine.littlekt.graphics.Color

fun main() {
    createLittleKtApp {
        width = 640
        height = 640
        backgroundColor = Color.DARK_GRAY
        title = "LittleKt Low Res Game Template"
    }.start {
        GameCore(it)
    }
}