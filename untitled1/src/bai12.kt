import kotlin.random.Random

fun main(args: Array<String>) {
     var M:IntArray = IntArray(5)
    var M1:FloatArray = FloatArray(3)
    println(M:: class.java.typeName)

    for (i in M)
    {
        print("$i\t")
    }

    var M3: IntArray = intArrayOf(1,2,5,8,7)

    println()
    for (i in M3)
    {
        print("$i\t")
    }
    println()
    println(M3[0])
    println(M3[1])
    println(M3[2])


    println()
    var rd = Random
    var  M7:IntArray = IntArray(6)
    println(M7.indices)

    for(i in M7.indices)
    {

    }
}