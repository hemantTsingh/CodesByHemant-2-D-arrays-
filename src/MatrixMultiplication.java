import java.util.*;


public class MatrixMultiplication {
    public static void main(String[] args){
        //input for matrix one
        Scanner rc=new Scanner(System.in);      //Scanner object
        int r1=rc.nextInt();
        int c1=rc.nextInt();
        
    
        int[][] one=new int[r1][c1];        //First Matrix
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j]=rc.nextInt();
    
    
            }
        }
    
        //input for matrix two
        int r2=rc.nextInt();
        int c2=rc.nextInt();
        
    
        int[][] two=new int[r2][c2];            //Second Matrix
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j]=rc.nextInt();
    
    
            }
        }
    
    //checking
    if(c1!=r2){                     //The main condition of columns of first matrix equating with rows of second matrix
        System.out.println("Invalid Multiplication");
        return ;
    }
    
    
    int[][] product=new int[r1][c2];            //The final matrix 
    for(int i=0;i<product.length;i++){
        for(int j=0;j<product[0].length;j++){
            for(int k=0;k<c1;k++){
                product[i][j]+=one[i][k]+two[k][j];
        
    
            
            
            }
        }
    }
    
    
    
    for(int i=0;i<product.length;i++){          //Printing the output
        for(int j=0;j<product[0].length;j++){
            System.out.print(product[i][j]+" ");
        }
        System.out.println();
    }
    
    }
    
    
}











