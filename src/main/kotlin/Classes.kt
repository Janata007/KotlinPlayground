class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

open class Person(
    var firstname: String,
    var surname: String = "markovic",
    var age: Int = 22, open var gender: String = "undisclosed",
) {
    open fun printInfo() {
        println("First name: ${firstname} Surname: ${surname} age: ${age}")
    }

}
class Woman : Person {
    constructor(firstname: String) : super(firstname)
    override var gender = "female"
    override fun printInfo() {
        println("Woman override function: ${firstname}, ${surname}, ${age}, ${gender}")
    }
}

public class MyTest{
    lateinit var subject: String
     fun setup(){
        subject = "Math"
    }

}

data class User(val name: String, val age: Int)