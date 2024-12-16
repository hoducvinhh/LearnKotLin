//fun main(args: Array<String>) {
//    var a=10
//    var b=2
//    try {
//        var c=a/b
//        println(c)
//    }
//    catch (e: Exception)
//    {
//        e.printStackTrace()
//    }
//    finally {
//
//            println("thoat khoi database")
//
//    }
//    println("doan code phia sau")
//}


fun Thuong(a:Int , b:Int):Int
{
    if(b==0)
    {
        throw Exception("mau =0 khong chia duoc")
    }
    return a/b
}
fun main(args: Array<String>) {

    try {
        Thuong(5,0)
    }
    catch (e:Exception)
    {
        println(e.message)
    }
    println("Doan code phia sau")
}