package com.example.demo.view

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Label
import javafx.scene.image.ImageView
import javafx.scene.layout.*
import javafx.scene.paint.Color
import tornadofx.*

object TopBanner : HBox(20.0) {

    val l1 = Label()
    val l2 = Label()
    val l3 = Label()
    val pharmacy = Label()

    init {
        val textStyle = "-fx-text-fill: BEIGE; -fx-font:normal 14px 'sans-serif'; "
        style = textStyle
        background = Background(BackgroundFill(Color(0.0, 0.582, 0.4648, 1.0), CornerRadii.EMPTY, Insets.EMPTY))
        alignment = Pos.CENTER_LEFT
        paddingAll = 10.0
        val hSpacer = Pane()
        val vSpacer = Pane()
        setHgrow(hSpacer, Priority.ALWAYS)
        VBox.setVgrow(vSpacer, Priority.ALWAYS)
        //add(ImageView("phabis-logo.png"))
        val TOP1 = VBox(3.0)
        with(TOP1) {
            padding = Insets(10.0)
            alignment = Pos.BOTTOM_LEFT
            val l1 = Label("E-mail: contact@phabis.mk")
            val l2 = Label("Телефон: 02/2444-566")
            val l3 = Label("Телефон: 02/2444-075")
            styleLabels(textStyle, l1, l2, l3)
            add(l1)
            add(l2)
            add(l3)
        }
        add(TOP1)
        add(hSpacer)
       // add(ImageView("livsane.png"))
        //add(ImageView("betty-logo.png"))
        val TOP2 = VBox(3.0)
        TOP2.alignment = Pos.BOTTOM_LEFT
        //initLabels()
        TOP2.style = textStyle
        TOP2.padding = Insets(10.0)
        styleLabels(textStyle, l1, l2, l3)
        TOP2.add(l1)
        TOP2.add(l2)
        TOP2.add(l3)
        TOP2.add(vSpacer)
        pharmacy.style = "-fx-font: normal bold 20px 'Arial Narrow'; -fx-background-color: BEIGE; -fx-padding: 7px "
        TOP2.add(pharmacy)
        add(TOP2)
    }

    private fun styleLabels(textStyle: String, l1: Label, l2: Label, l3: Label) {
        l1.style = textStyle
        l2.style = textStyle
        l3.style = textStyle
    }

    /*fun initLabels() {
        with(PhabisConfig) {
            l1.text = "Корисник: ${loggedInAccount.login}, ${loggedInAccount.firstName} ${loggedInAccount.lastName}"
            l2.text = "Фискален: ${fiscalStatus}"
            l3.text = "Верзија:  ${version}"
            pharmacy.text = loggedInAccount.pharmacy?.pharmacyName ?: "N/A"
        }
    }

     */
}
