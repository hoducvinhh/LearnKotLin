class NhanvienDiCa:NhanVien{

    constructor(ten:String, cccd:String): super(ten,cccd)
    constructor(ten:String, cccd:String,que:String): super(ten,cccd,que)
    override fun TinhLuong(): Double {
        return luongCoBan*1.05
    }
}