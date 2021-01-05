public class ni {
    public static void main(String[] args){
        btech a=new btech();
        a.semester();
        a.msg();
    }
    
}
interface hemant{
    void semester();
    interface hello{
        void msg();
    }
}
class btech implements hemant.hello{
    public void semester(){
        System.out.println("Hemant Singh");
    }
    public void msg(){
        System.out.println("Hemant Singh CSE");
    }
}