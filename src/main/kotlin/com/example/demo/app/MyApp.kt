package com.example.demo.app

import com.example.demo.view.MainView
import javafx.stage.Stage
import tornadofx.App

class MyApp: App(MainView::class, Styles::class){
    override fun start(stage: Stage){
        with(stage) {
            width = 900.0
            height = 500.0
        }
        super.start(stage)
    }

}