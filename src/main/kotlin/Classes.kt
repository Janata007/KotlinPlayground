import javax.naming.Context

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

open class Person(var firstname: String,
             var surname: String = "markovic",
             var age: Int = 22,
){
    open fun printInfo(){
        println("First name: ${firstname} Surname: ${surname} age: ${age}")
    }

}

class Woman : Person{
    constructor(firstname: String) : super(firstname)
    override fun printInfo(){
        println("Woman override function: ${firstname}, ${surname}, ${age}")
    }
}