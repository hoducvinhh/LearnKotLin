fun main(args: Array<String>) {

    var M:Array<IntArray> = Array(3,{IntArray(4)})
    for(i in M.indices){
        for(j in M[i].indices)
        {
            print("$i$j\t")
        }
        println()
    }

}
