public class AC {
    public static void main(String[] args){
        B f=new M();
        f.c();
        f.b();
        f.a();
        f.d();

    }  
}
interface A{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A{
public void c(){System.out.println("This is c");}
}
class M extends B{
    public void b(){System.out.println("This is b");}
    public void a(){System.out.println("This is a");}
    public void d(){System.out.println("This is d");}
}
