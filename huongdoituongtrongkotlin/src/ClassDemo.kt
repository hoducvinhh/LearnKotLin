open class Human {

    lateinit var name: String
    var year = 0

    constructor(name: String, year: Int) {
        this.name = name
        this.year - year
    }

    open fun pirntInfo() {
        println("$name $year")
    }


}


class Student(var id: Int, name: String, year: Int) : Human(name, year) {
    override fun pirntInfo() {
        println(id)
        super.pirntInfo()
    }
}