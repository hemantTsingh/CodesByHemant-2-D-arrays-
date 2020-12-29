import java.util.*;
import java.lang.*;
public class SpiralTraversal {
    public static void main(String[] args)throws Exception{
        System.out.println("Daalde Beta numbers");
        Scanner s= new Scanner(System.in);
        int m =s.nextInt();
        int n =s.nextInt();
        int ar[][]=new int[m][n];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                ar[i][j]=s.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=ar.length-1;
        int maxc=ar[0].length-1;
        int total_elements=m*n;
        int count=0;
        while(count<total_elements){
        //left wall

        for(int i=minr,j=minc;i<=maxr&&count<total_elements;i++){
                System.out.print(ar[i][j]+" ");
                count++;
        } 
        minc++;

        //Bottom wall

        for(int i=maxr,j=minc;j<=maxc&&count<total_elements;j++){
            System.out.print(ar[i][j]+" ");
            count++;
        }
        maxr--;
         //Right wall

         for(int i=maxr,j=maxc;i>=minr&&count<total_elements;i--){
            System.out.print(ar[i][j]+" ");
            count++;
        }
        maxc--;

         //top wall

         for(int i=minr,j=maxc;j>=minc&&count<total_elements;j--){
            System.out.print(ar[i][j]+" ");
            count++;
        }
        minr++;

            }







    }
    
}
