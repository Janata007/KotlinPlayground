package com.example.demo.style

import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import tornadofx.*

class MyStyle : Stylesheet() {

    companion object {
        val tackyButton by cssclass()
        private val topColor = Color.LIGHTPINK
        private val bottomColor = Color.LIGHTPINK
        private val rightColor = Color.LIGHTPINK
        private val leftColor = Color.LIGHTPINK
    }
    init{
        tackyButton{
            borderColor += box(topColor, rightColor, bottomColor, leftColor)
            fontFamily = "Comic Sans MS"
        }
    }
}