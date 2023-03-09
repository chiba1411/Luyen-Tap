/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap;

/**
 *
 * @author Admin
 */
public class QuaTao extends HoaQua{
    //property
    String mau;
    String vi;
    public QuaTao(int gia, String xuatXu, int soLuong, String ngayNhap,String mau,String vi) {
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
