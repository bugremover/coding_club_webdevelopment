import java.util.*;
public class matrix_mutli {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        //int cols=sc.nextInt();
        int[][] c=new  int [rows][rows];
        int[][] matrix1=new int[rows][rows];
        int[][] matrix2=new int[rows][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter new matrix---");
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                  c[i][j]=0;
                  for(int k=0;k<rows;k++){
                    c[i][j]=c[i][j]+matrix1[i][k]*matrix2[k][j];
                  }
            }
        }
        System.out.println("matrix mutliplication");
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
