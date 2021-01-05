class A{
    interface message{
        void msg();
    }
}
public class ninterfaceDeclaredWithinTheClass implements A.message{
    public void msg(){
    System.out.println("Class k andr interface");}
        public static void main(String[] args){
    A.message a=new ninterfaceDeclaredWithinTheClass();
    a.msg();
}
}


//dot (.) lga ke reference lelo obj bnane ko
//and implement karao nested m dot lgake 
//alag alag interface ho(nested na ho) tb comma lgake implement kara lo class m 
