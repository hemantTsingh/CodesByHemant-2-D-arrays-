import java.util.*;
public class recurse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        less(n);
}
    public static void less(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        less(n-1);
    }
   
}
