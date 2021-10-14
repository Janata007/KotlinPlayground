package com.example.demo.controller

import com.example.demo.model.*
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.Controller
import tornadofx.asObservable
import java.time.LocalDate

class ListController : Controller() {
    //val values = FXCollections.observableArrayList("Alpha", "Beta","Gamma","Delta")
    val persons = FXCollections.observableArrayList<Person>(
        Person(
            1, "Samantha", LocalDate.of(1981, 12, 4), FXCollections.observableArrayList<Project>(
                Project(1, "Project1", "Math"),
                Project(2, "Project2", "Biology")
            )
        ),
        Person(
            2, "Tom", LocalDate.of(2004, 1, 23),
            FXCollections.observableArrayList<Project>(
                Project(1, "Project1", "Science"),
                Project(2, "Project2", "Chemistry")
            )
        ),
        Person(
            3, "Stuart", LocalDate.of(1989, 5, 23), FXCollections.observableArrayList<Project>(
                Project(1, "Project1", "Korean"),
                Project(2, "Project2", "Chemistry")
            )
        ),
        Person(
            4, "Nicole", LocalDate.of(1999, 8, 11), FXCollections.observableArrayList<Project>(
                Project(1, "Project1", "English"),
                Project(2, "Project2", "Korean")
            )
        )
    )
}