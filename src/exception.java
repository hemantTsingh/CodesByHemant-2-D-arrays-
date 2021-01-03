public class exception {

    public static void main(String[] args){
    try{

        int m =100/0;

    }catch(ArithmeticException e){

        System.out.println("Caught you !");
    }
    finally{
        System.out.println("I print no matter Exception is handled or not");
    }
    
}
}
