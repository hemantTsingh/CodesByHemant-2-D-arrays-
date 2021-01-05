/*If a class implements multiple interface, 
or an interface extends multple interfaces
it is known as multiple inheritence*/
public class Multiplleinheritence implements hemant,saransh{
    public void show(){System.out.println("Hemant is my name");}
    public void print(){System.out.println("I am learning things");}
    
    public static void main(String[] args){
    Multiplleinheritence m= new Multiplleinheritence();
    m.show();
    m.print();
} 
}
interface hemant{void show();}
interface saransh{void print();}

