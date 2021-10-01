interface Named{
    val name: String
}

interface Human : Named{
    val firstname: String
    val lastname: String
    override val name: String
        get() = "$firstname @$lastname"
}

class Employee(override val firstname: String, override val lastname: String) : Human{}