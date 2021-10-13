package com.example.demo.view

import com.example.demo.app.Styles
import javafx.geometry.Pos
import tornadofx.*

class BottomView : View("My View") {
    override val root = vbox{
        alignment =  Pos.CENTER

        label(){
            text = "Bottom View"
            addClass(Styles.heading)
        }

    }
}
