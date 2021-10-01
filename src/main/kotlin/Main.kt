fun main(args: Array<String>) {
    println("Hello")
    // val name = readLine();
    // println("Hello, $name")
    // println("Program arguments: ${args.joinToString()}")
    val rectangle = Rectangle(5.0, 2.0)
    println("Rectangle perimeter is ${rectangle.perimeter}")
    println("Max is: ${maxOf(1, 2)}")
    listItems(items)
    whenFunction(2)
    var woman = Woman("jana")
    woman.printInfo()
    var test = MyTest()
    //println("Test subject is ${test.subject}") //throws not initialized
    test.setup()
    println(test.subject)

    //class implementing interface
    var employee = Employee("jana", "markovic")
    print(employee.firstname)

    //FUNCTION EXTENTIONS
    val list = mutableListOf(1, 2, 3)
    println("OG list: ${list}")
    list.swap(0, 2)
    println("Swapped list: ${list}")



} // end of main

fun maxOf(a: Int, b: Int) = if (a > b) a else b
val items = listOf("predmet1", "predmet2", "predmet3")

fun listItems(l: List<String>) {
    var indeks=0
    for (index in items.indices) {
        println("For loop: Item at $index is ${l[index]}")
    }
    loop@ while(indeks < items.size){
        if(indeks == 2) break@loop
        println("While loop: item at $indeks is ${items[indeks]}")
        indeks++
    }
}
fun whenFunction( x : Int){
when (x){
    in 1..10 -> println("x is in the range")
    !in 10..20 -> println("x is out of range")
    else -> ("none of the above")
}
}
fun <T> MutableList<T>.swap(index1 : Int, index2: Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}