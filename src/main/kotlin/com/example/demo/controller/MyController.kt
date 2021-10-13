package com.example.demo.controller

import tornadofx.Controller

class MyController : Controller() {
    fun writeToDb(inputvalue: String){
        println("Writing $inputvalue to database!")
    }
}