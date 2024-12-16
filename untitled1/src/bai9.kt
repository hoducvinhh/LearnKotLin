import java.text.SimpleDateFormat
import java.util.Calendar

//import java.text.SimpleDateFormat
//import java.util.Calendar
//import java.util.SimpleTimeZone
//
//fun main(args: Array<String>) {
//    var cal = Calendar.getInstance()
//    println(cal)
//
//    //get ngay thang nam
//    var nam = cal.get(Calendar.YEAR)
//    var thang = cal.get(Calendar.MONTH)
//    var ngay = cal.get(Calendar.DAY_OF_MONTH)
//    println("ngay thang nam hien tai+ $ngay/${thang+1}/$nam")

//    //xuat ngay thang nam
//    var date = cal.time
//    //khai bao dinh dang
//    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
//    println(dinhDang.format(date))
//
//    //khai bao dinh dang loai 2
//    var dinhDang2 = SimpleDateFormat("dd//MM//yyyy hh:mm:ss a")
//    println(dinhDang2.format(date))
//}

fun main(args: Array<String>) {

    var dinhDangDate = SimpleDateFormat("dd/MM/yyyy")

    println("moi nhap vao ngay thang nam sinh: ")
    var s = readLine()
    if(s==null)
    {
        return
    }
    else
    {
        var dateInput = dinhDangDate.parse(s)
        var timeNamSinh = Calendar.getInstance()
        timeNamSinh.time= dateInput
        var namSinh = timeNamSinh.get(Calendar.YEAR)
        var thangSinh = timeNamSinh.get(Calendar.MONTH)
        var ngaySinh = timeNamSinh.get(Calendar.DAY_OF_MONTH)

        var date = timeNamSinh.time
        println(dinhDangDate.format(date))
        
        println("Ban sinh ngay $ngaySinh/${thangSinh+1}/$namSinh")

        var timeHienTai = Calendar.getInstance()
        var namHienTai = timeHienTai.get(Calendar.YEAR)
        var tuoi = namHienTai - namSinh
        println("Hien tai da $tuoi")
    }
}

