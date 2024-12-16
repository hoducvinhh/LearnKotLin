fun main(args: Array<String>) {
    var soA:Int = 35
    var soB:Long  = soA.toLong()

    // kiem tra kieu loai
    println(soA :: class.java.typeName)
    println(soB :: class.java.typeName)
    println("so B la : $soB")
}