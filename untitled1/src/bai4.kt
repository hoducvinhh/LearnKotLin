fun main(args: Array<String>) {
    var a = 10 // khai bao tat , tu dong nhan kieu int
    var b = 3

    //phep cong
    println("cach 1 a+b= "+(a+b))
    println("cach 2 a+b= "+ a.plus(b))


    //phep tru
    println("cach 1 a-b= "+(a-b))
    println("cach 2 a-b= "+ a.minus(b))

    // phep nhan
    println("cach 1 a*b= "+(a*b))
    println("cach 2 a*b= "+ a.times(b))

    // phep chia
    println("cach 1 a/b= "+(a/b))
    println("cach 2 a/b= "+ a.div(b))

    var kq:Float = a.toFloat()/b
    println("kq = "+ kq)

    // phep chia lay du
    println("cach 1 a%b= "+(a%b))
    println("cach 2 a%b= "+ a.rem(b))


    var x:Float = 9.2f
    var y= x.unaryMinus() // y = -9.2
    var z= x.unaryPlus() // y = 9.2
    
}