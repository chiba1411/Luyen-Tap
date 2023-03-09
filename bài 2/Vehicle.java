
package LuyenTap;

public class Vehicle {
    String color;
    double model;
    public Vehicle(String color,double model){
        this.color=color;
        this.model=model;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public void setmodel(String model){
        this.model=this.model;        
    }
    public String getcolor(){
        return this.color;
    }
    public double getmodel(){
        return this.model;
    }
    public static void run(){
        System.out.println("Hello");
    }
}
