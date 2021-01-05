public class interface_inheritence implements printable,showable {
    public void print(){System.out.println("My name is Hemant");}
    public void show(){System.out.println("I am pursuing B.tech");}
    public static void main(String[] args){

        interface_inheritence pqr=new interface_inheritence();
        pqr.print();
        pqr.show();
    }
}
interface printable{void print();}
interface showable extends printable{void show();}
