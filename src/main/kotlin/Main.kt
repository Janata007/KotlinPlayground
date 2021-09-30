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
}

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

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