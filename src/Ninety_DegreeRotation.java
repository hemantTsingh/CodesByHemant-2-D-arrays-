import java.util.*;
public class Ninety_DegreeRotation {
    public static void main(String[] args)throws Exception{
        Scanner scn=new Scanner(System.in);
        System.out.println("Now enter n for order");

        int n =scn.nextInt();
        int hem[][]=new int[n][n];
        for(int i=0;i<hem.length;i++){      //values are taken
            for(int j =0;j<hem[0].length;j++){
                hem[i][j]=scn.nextInt();
            }
        }


         //Display of the Input Matrix matrix
         for(int i=0;i<hem.length;i++){
            for(int j =0;j<hem[0].length;j++){
                System.out.print(hem[i][j]+" ");

            }
            System.out.println();
        }
        

        //Transpose of matrx

        int t[][]=new int[n][n];
        for(int i=0;i<hem.length;i++){
            for(int j=0;j<hem[0].length;j++){
                t[j][i]=hem[i][j];

            }
        }
        //Reversal of Rows

        for(int i=0;i<t.length;i++){

            int li=0;
            int ri=t[0].length-1;
            while(li<ri){
                int temp=t[i][li];
                t[i][li]=t[i][ri];
                t[i][ri]=temp;
                li++;
                ri--;
            }

        }
        System.out.println("The Rotated Matrix is\n");
        //Display of the rotated matrix
        for(int i=0;i<t.length;i++){
            for(int j =0;j<t[0].length;j++){
                System.out.print(t[i][j]+" ");

            }
            System.out.println();
        }
        
    }
    
}
