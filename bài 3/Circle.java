package LuyenTap;

public class Circle extends Shape{
    //property
    double radius=1; 
    float pi=3.14f;
    //methob khong tham ,co tham so
    public Circle(){        
    }
    public Circle(double radius){
        this.radius=radius;
    }
    //add contructor
    public Circle(String color,boolean filled){
        super(color,filled);        
    }
    //set thay doi giat tri
    public void  setRadius(double radius){
        this.radius=radius;
    }
    //get tra ve gia tri
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*radius*pi;
    }
    public double getPerimeter(){
        return this.radius*2*pi;
    }
    @Override
    public String toString(){
        return "(dien tich:"+getArea()+"chu vi:"+getPerimeter()+")";
    }
}
