package com.example.demo.view

import com.example.demo.app.Styles
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class MainView : View("TornadoFX App") {
private val topView = find(TopView::class)

    override val root = borderpane {
        top = topView.root
        bottom<BottomView>()
    }
}