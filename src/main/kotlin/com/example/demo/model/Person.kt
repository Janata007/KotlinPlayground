package com.example.demo.model

import javafx.beans.property.SimpleObjectProperty
import javafx.collections.ObservableList
import java.time.LocalDate
import java.time.Period

class Person(val id: Int, val name: String, val birthday: LocalDate, val projects: ObservableList<Project>){
    val age: Int
    get() = Period.between(birthday, LocalDate.now()).years
}