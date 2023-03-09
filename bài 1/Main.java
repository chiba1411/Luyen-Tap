
package LuyenTap;

public class Main {
    public static void main(String[] args) {
        HoaQua obj=new HoaQua(5,"viet nam",2,"9-3-2022");
        System.out.println("gia:"+obj.getgia());
        System.out.println("xuatxu:"+obj.getxuatXu());
        System.out.println("so luong:"+obj.getsoLuong());
        System.out.println("ngay nhap:"+obj.getngayNhap());
        System.out.println(""+obj.toString());
        
    }
    
}
