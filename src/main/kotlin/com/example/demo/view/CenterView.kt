package com.example.demo.view

import com.example.demo.controller.ListController
import javafx.stage.StageStyle
import tornadofx.*

class CenterView : View("My View") {
    val controller: ListController by inject()

    override val root = vbox()
    init{
        with(root){
            this+=label("My items")
            this+=listview(controller.values)
            button{text="Press me for popup"; action{
                find<MyFragment>().openModal(stageStyle = StageStyle.UTILITY)
            }}
        }
    }
}