
package LuyenTap;

public class HoaQua {
    //property
    int gia;
    String xuatXu;
    int soLuong;
    String ngayNhap;
    //methob co tham so
    public HoaQua(int gia,String xuatXu,int soLuong,String ngayNhap){
        this.gia=gia;
        this.xuatXu=xuatXu;
        this.soLuong=soLuong;
        this.ngayNhap=ngayNhap;
    }
    //setgia thay doi gia tri
    public void setgia(int gia){
        this.gia=gia;
    }
    //setxuatXu thay doi gia tri
    public void setxuatxu(String xuatXu){
        this.xuatXu=xuatXu;
    }    
    //setsoLuong thay doi gia tri
    public void setsoLuong(int soLuong){
        this.soLuong=soLuong;
    }
    //setngayNhap thay doi gia tri
    public void setngayNhap(String ngayNhap){
        this.ngayNhap=ngayNhap;
    }

    //getgia tra ve gia tri
    public int getgia(){
        return this.gia;
    }
    //getxuatXu tra ve gia tri
    public String getxuatXu(){
        return this.xuatXu;
    }
    //getsoLuong tra ve gia tri
    public int getsoLuong(){
        return this.soLuong;
    }
    //getngayNhap tra ve gia tri
    public String getngayNhap(){
        return this.ngayNhap;
    }
    //gettinhtien 
    public double gettinhTien(){
        return this.gia*soLuong;
    }
    @Override
    public String toString(){
        return "(tong tien="+ gettinhTien()+")";
    }
    
    
}
