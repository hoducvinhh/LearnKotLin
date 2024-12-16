class LopSV2 {
   var ma:Int =0
  var ten: String =""
    private var diemToan:Float =0f


    var DiemToan : Float
        get()
        {
            return diemToan
        }
        set(value)
        {
            diemToan = value
        }

    private var diemVan:Float = 0f
    var DiemVan:Float
        get()
        {
            return diemVan
        }
        set(value)
        {
            diemVan = value
        }

    constructor()
    {
        ma =0
        ten = "No Name"
    }

    constructor(m:Int, t:String)
    {
        ma =m
        ten = t
    }

    fun xuatThongTin()
    {
        println("Ten sinh vien la: $ten")
        println("Ma sinh vien la: $ma")
    }


}