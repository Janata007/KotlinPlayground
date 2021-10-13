package com.example.demo.view

import com.example.demo.app.Styles
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class TopView : View("My View") {
    override val root =  vbox {
        alignment = Pos.CENTER
        spacing = 10.0
        val labelText = SimpleStringProperty()

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
