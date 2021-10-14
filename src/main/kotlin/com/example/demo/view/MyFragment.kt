package com.example.demo.view

import com.example.demo.controller.ListController
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class MyFragment : Fragment() {
    val controller: ListController by inject();
val addition = SimpleStringProperty()
    override val root = vbox {
        hbox {
            label("Name")
            textfield(addition)
        }
        button {
            text = "ADD"
            useMaxWidth = true
            action{
                controller.values.add(addition.value)
            }
        }
    }

}
