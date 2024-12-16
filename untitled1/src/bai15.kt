

fun main(args: Array<String>) {
//    var Sv1 = SinhVien(1, "nguyen thi linh")
//    println("")
//    var Sp1 = SanPham()
//    var Sp2 = SanPham(1, "TV", 1000)
    var Sv2 = LopSV2()
//    var Sv3 = LopSV2(1, "Loan")
//    println("tt sv2 la: ${Sv2.ma} - ${Sv2.ten}")
//    println("tt sv3 la: ${Sv3.ma} - ${Sv3.ten}")

   Sv2.DiemToan = 9f
    println("diem toan cua sinh vien 2 la: ${Sv2.DiemToan}")
    Sv2.DiemVan = 8f

    //var dtbsv2 = Sv2.DTB(Sv2.DiemToan, Sv2.diemVan)
    //println("DTb cua Sv2 la $dtbsv2")

}