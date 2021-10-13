package com.example.demo.view

import com.example.demo.controller.ListController
import tornadofx.*

class CenterView : View("My View") {
    val controller: ListController by inject()

    override val root = vbox {
        label("My items")
        listview(controller.values)
    }
}
