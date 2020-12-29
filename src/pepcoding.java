import java.util.*;
public class pepcoding {
    public static void main(String[] args)throws Exception{
        Scanner hem=new Scanner(System.in);
        int m=hem.nextInt();
        int n=hem.nextInt();

        int[][] arr=new int[m][n];

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                arr[i][j]=hem.nextInt();

            }
        }
        System.out.println("Values are enterred now\n Now printing them");
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println("");

        }


}
    
}
    