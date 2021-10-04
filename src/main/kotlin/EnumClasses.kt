enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
fun <T> asList(vararg ts : T): ArrayList<T> {
    val result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}