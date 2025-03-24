fun sum1(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun sum3(a:Int, b:Int = 10, c:Int){
    println("${a+b+c}")
}


fun main() {
    println(sum1(1, 2, 3))

}