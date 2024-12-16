import jdk.jshell.SourceCodeAnalysis.Suggestion

open abstract  class NhanVien {
    protected var ten:String=""
    protected var cccd:String=""
    protected var que:String=""
    var luongCoBan:Double = 1200.0

    public abstract fun TinhLuong():Double

    constructor(ten:String, cccd:String, que:String)
    {
        this.ten = ten
        this.cccd = cccd
        this.que = que
    }

    constructor(ten:String, cccd: String)
    {
        this.ten = ten
        this.cccd = cccd
    }

}