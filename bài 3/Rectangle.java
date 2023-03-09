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
public class Rectangle extends Shape{
    //property
    double width=1;
    double length=1;
    //khong tham so,co tham so
    public Rectangle(){
        
    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    //add contructor
    public Rectangle(String color,boolean filled){
        super(color,filled);
    }
    //set thay doi gia tri
    public void setWidth(){
        this.width=width;
    }
    public void setLength(){
        this.length=length;
    }
    //get tra ve gia tri
    public double getWith(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return this.width*length;
    }
    public double getPerimeter(){
        return this.width*2+length*2;
    }
    @Override
    public String toString(){
        return "dien tich:"+getArea()+"chu vi"+getPerimeter()+"";
    }
}
