import java.util.*;
public class WaveTraversal {

    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter rows and columns "+" ");
        int m=scn.nextInt();
        int n=scn.nextInt();
        int arr[][]=new int[m][n];          //Entries of Matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int j=0;j<arr[0].length;j++){           //Whenever wave is being forward, on even columns rows are increasing and on odd columns, rows are decreasing.

            if(j==0){                                   //Incrementing rows and hence printing
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
                
            }
            else{                                   
                for(int i=arr.length-1;i>=0;i--){                           //decrementing rows and hence printing
                    System.out.print(arr[i][j]+" ");
                }


            }
        }

    }
    
}
