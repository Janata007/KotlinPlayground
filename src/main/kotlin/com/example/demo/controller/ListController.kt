package com.example.demo.controller

import javafx.collections.FXCollections
import tornadofx.Controller

class ListController: Controller() {
    val values = FXCollections.observableArrayList("Alpha", "Beta","Gamma","Delta")
}