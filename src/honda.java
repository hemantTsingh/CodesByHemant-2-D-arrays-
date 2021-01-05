/*Abstract class having constructors
,data member and methods.
*/
public class honda{
    public static void main(String[] args){
    
        bike ktm=new hemant();
        ktm.run();
        ktm.changegear();
        }
}

abstract class bike{
    bike(){
        System.out.println("This is bike");
    }
    abstract void run();
    void changegear(){
        System.out.println("Change the gear bro !");
    }
    }

    class hemant extends bike{
        void run(){
            System.out.println("Run safely dude !");
        }
       
}

