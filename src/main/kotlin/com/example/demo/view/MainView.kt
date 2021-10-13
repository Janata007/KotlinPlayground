package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MyController
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class MainView : View("TornadoFX App") {
private val topView = find(TopView::class)
    val centerView = find(CenterView::class)
    override val root = borderpane {
        top = topView.root
        bottom<BottomView>()
        center = centerView.root
    }
}