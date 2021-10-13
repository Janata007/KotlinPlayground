package com.example.demo.view

import com.example.demo.app.Styles
import tornadofx.*

class MainView : View("TornadoFX App") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
        label("Hello")
    }
}