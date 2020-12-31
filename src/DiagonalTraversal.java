import java.util.*;
public class DiagonalTraversal {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int m =scn.nextInt();
      

        int arr[][]=new int[m][m];
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("Upper Diagonal Values are : ");
        for(int g=0;g<arr.length;g++){
            for(int i=0,j=g;j<arr.length;i++,j++){
                System.out.print(arr[i][j]+" ");

            }
        }






    }
    
}
