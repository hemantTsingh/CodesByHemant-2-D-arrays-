/*It is a blueprint of a class.It has static constants 
and abstract methods. 
The interface in java is a mechanism to achieve abstraction.
There can be only abstract methods in the java interface, not method body.It is used to achieve abstraction
and multiple inheritance in java 
It also represents the IS-A relationship.
It cannot be instantiated just ilke the abstract class.
since java 8, e can have default and static methods in an interface.
We can have private methods in an interface.
1.Used to achieve abstraction.
2.By interface, we can support functionality of
multiple inheritance.
3.It can be sed to achieve loose coupling.



declaration of an interface:
interface<interface name>
{
//declare constant fields
//declare methods that are abstract
//by default.
Interface fields are public,static and final by default, and the methods are public
and abstract.



}*/
public class interfce implements printable {
public void print(){System.out.println("This is printable");}
public static void main(String[] args){
    interfce p=new interfce();
    p.print();
}
}

interface printable{
    void print();
}
