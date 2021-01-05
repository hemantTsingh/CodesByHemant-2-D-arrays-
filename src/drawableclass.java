public class drawableclass {
    public static void main(String[] args){
        drawable c=new circle();
        drawable r=new rectangle();
        drawable r1=new rhombus();
        c.draw();
        r.draw();
        r1.draw();
        
}
}
interface drawable{
    void draw();
}
class circle implements drawable{
   public void draw(){System.out.println("This is circle");}
}
class rhombus implements drawable{
    public void draw(){System.out.println("This is rhombus");}
}
class rectangle implements drawable{
    public void draw(){System.out.println("This is rectangle");}
}