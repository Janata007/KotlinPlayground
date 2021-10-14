package com.example.demo.view

import com.example.demo.controller.ListController
import com.example.demo.model.*
import com.example.demo.style.MyStyle
import javafx.scene.control.Button
import javafx.scene.control.SelectionMode
import javafx.scene.paint.Color
import javafx.stage.StageStyle
import tornadofx.*

class CenterView : View("My View") {
    val controller: ListController by inject()

    override val root = vbox()
    init{
        with(root){
            this+=label("My items")

            tableview(controller.persons){
                readonlyColumn("ID", Person::id)
                readonlyColumn("Name", Person::name)
                readonlyColumn("Birthday", Person::birthday)
                readonlyColumn("Age",Person::age).cellFormat {
                    text = it.toString()
                    style{
                        if(it < 18){
                            backgroundColor+= Color.CRIMSON
                            textFill = Color.WHITE
                        }
                    }
                }
                rowExpander(expandOnDoubleClick = true){
                   // paddingLeft = expanderColumn.width
                    tableview(it.projects) {
                        setMaxSize(200.0, 100.0)
                        readonlyColumn("ID", Project::id)
                        readonlyColumn("NAME", Project::projectName)
                        readonlyColumn("SUBJECT", Project::subject)
                    }
                }
            }
            button{text="Press me for popup";
                action{
                find<MyFragment>().openModal(stageStyle = StageStyle.UTILITY)
            }}
            children.asSequence()
                .filter { it is Button }
                .forEach { it.addClass(MyStyle.tackyButton)}
        }
    }
}