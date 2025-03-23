import com.sun.org.apache.xerces.internal.xs.XSConstants

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello")
    print("Hello")

    //number
    var i = 10
    i++
    val j: Byte = 11
    var k: Long = 12L

    var d = 1.5
    var e: Float = 1.5f
    println("$i")

    //String Char
    var s1 = "az"
    var c1 = s1[0]
    s1.uppercase()
    s1.trim()
    var s2 = """Hi """
    s2.trimMargin()

//Bool
    val b: Boolean = true
    println(!b)
    println(b)


    //pair triple
    var p = Pair(4, true)
    var p2 = Pair<Long, Boolean>(4, true)

    var t = Triple<Int, Double, Float>(3, 5.0, 5f)


    //collection

    var l1: List<Int> = listOf(1, 2, 3)
    var l2 = mutableListOf(4, 5, 6)
    l2.add(3)
    println("$l1 $l2")

    var l3  = setOf("a", "a")  // kieu set luu cac gia tri khong giong nhau


    var MapA = mapOf("x" to 1)
    var mapB = mutableMapOf("y" to 2)
    mapB.put("z",3)
}
