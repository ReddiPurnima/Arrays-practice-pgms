import java.util.*;
public class addition_of_2matrices
{
public static void main(String[] args) {
    int r=3;
    int c=3;
    Scanner sc=new Scanner(System.in);
      int[][] a=new int[3][3];
      int[][] b=new int[3][3];
      System.out.println("entrer first matrix");
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
     } }
     System.out.println("enter second matrix");
      for(int i=0;i<3;i++){
     for(int j=0;j<3;j++){
        b[i][j]=sc.nextInt();
       }}
       System.out.println("addition of matrix");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
             System.out.print(a[i][j]+b[i][j]+" ");  
           }
           System.out.println();
       }
}
}
