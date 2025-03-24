//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var list = listOf(10, 20, 30, 40, 50)
    println("===for===")
    for (i in 0..(list.size)) {
        println(list[i])
    }

    for (i in (list.size-1) downTo 0)
    {
        println("hello")
    }

    
}