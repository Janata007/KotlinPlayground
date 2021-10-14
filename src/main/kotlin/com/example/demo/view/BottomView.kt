package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MyController
import com.example.demo.style.MyStyle
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class BottomView : View("My View") {
    val controller : MyController by inject()
val input = SimpleStringProperty()

    override val root = form{
        alignment =  Pos.CENTER
       fieldset {
           field("Input"){
               textfield(input)
           }
           button("Commit"){
               addClass(MyStyle.tackyButton)
               action{

                       controller.writeToDb(input.value)

                   input.value=""
               }
           }
       }

    }
}
