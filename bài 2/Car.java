
package LuyenTap;

public class Car extends Vehicle{
    public Car(String color,double model){
        super(color,model);
    }
    public static void main(String[] args){
        Vehicle obj = new Vehicle("red",1411);
        obj.run();
    }           
    
}
