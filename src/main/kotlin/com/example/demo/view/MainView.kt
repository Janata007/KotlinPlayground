package com.example.demo.view

import com.example.demo.app.Styles
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class MainView : View("TornadoFX App") {

    override val root = borderpane {
        top<TopView>()
        bottom<BottomView>()
    }
}

class TopView: View(){
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
class BottomView: View(){
    override val root = vbox{
        alignment =  Pos.CENTER

        label(){
            text = "Bottom View"
            addClass(Styles.heading)
        }

    }
}