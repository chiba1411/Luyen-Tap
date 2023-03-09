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
public class Square extends Rectangle{      
    //khong tham so, co tham so
    public Square(){        
    }
    public Square(double side){
       super(side,side);        
    }
    //add contructer
    public Square(String color,boolean filled,double side){
        super(color,filled,side,side);        
    }
    //
    public double getSide(){
        return getWith();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }
    @Override
    public String toString(){
        return "side:"+getSide()+"";
    }
}
