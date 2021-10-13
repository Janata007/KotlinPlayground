package com.example.demo.view

import com.example.demo.app.Styles
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class MainView : View("TornadoFX App") {
    var labelText = SimpleStringProperty()

    override val root = vbox {
        alignment = Pos.CENTER
        spacing = 10.0
        label(labelText) {
            bind(labelText)
            addClass(Styles.heading)
        }

        button {
            this.text = "Click"
            action {
                labelText.set("Hello")
            }
        }

    }
}