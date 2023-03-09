
package LuyenTap;
public class QuaCam extends HoaQua {
    //property
    String mau;
    String vi;
    //add contructor
    public QuaCam(int gia, String xuatXu, int soLuong, String ngayNhap,String mau,String vi) {
        super(gia, xuatXu, soLuong, ngayNhap);
        this.mau=mau;
        this.vi=vi;
    }
    //setmau thay doi gia tri
    public void setmau(String mau){
        this.mau=mau;
    }
    //setvi thay doi gia tri
    public void setvi(String vi){
        this.vi=vi;
    }
    //getmau tra ve gia tri
    public String getmau(){
        return this.mau;
    }
    //getvi tra ve gia tri
    public String getvi(){
        return this.vi;
    }
    
}
