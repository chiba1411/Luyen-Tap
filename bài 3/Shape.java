
package LuyenTap;

public class Shape {
    //property
    String color;
    boolean filled=true;
    //method khong tham so
    public Shape(){
        
    }
    //methob co tham so
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
   //set thay doi gia tri
    public void setcolor(String color){
        this.color=color;
    }
    public void isfilled(boolean filled){
        this.filled=filled;
    }
    //get tra ve gia tri
    public String getcolor(){
        return color;
    }
    public boolean isfilled(){
        return filled;
    }
    @Override
    public String toString(){
        return "color:"
                +getcolor()
                + ( isfilled() ? " filled" : " not filled");
    }
}
