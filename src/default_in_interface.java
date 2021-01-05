public class default_in_interface {
    public static void main(String[] args){
        drawable mks=new Rectangle();
        mks.msg();
        mks.draw();
    }
    
}
interface drawable{void draw();

default void msg(){
    System.out.println("Hemant Singh");
}
}
class Rectangle implements drawable{
    public void msg(){
        System.out.println("Default and static methods in interfaces");
    }
    public void draw(){
        System.out.println("This is draw function");
    }
}