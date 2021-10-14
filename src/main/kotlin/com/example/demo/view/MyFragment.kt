package com.example.demo.view

import com.example.demo.controller.ListController
import com.example.demo.model.*
import com.example.demo.style.MyStyle
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import java.time.LocalDate
import kotlin.random.Random

class MyFragment : Fragment() {
    val controller: ListController by inject();
val addition = SimpleStringProperty()
 val birthDate = SimpleObjectProperty<LocalDate>()

    override val root = vbox {
        setMinSize(100.0, 100.0)
        form {
            fieldset("Personal Info") {
                field("Name") {
                    textfield(addition)
                }
                field("Birthday") {
                    datepicker(birthDate)
                }
            }
        }
        button {
            addClass(MyStyle.tackyButton)
            text = "ADD"
            useMaxWidth = true
            action{
                val list = listOf( Project(Random.nextInt(2,100), "Project3", "Math")).asObservable()
                val p = Person(Random.nextInt(1,100), addition.value,
                    LocalDate.of(birthDate.value.year, birthDate.value.month, birthDate.value.dayOfMonth),
                    list)
                controller.persons.add(p)
            }
        }
    }

}
