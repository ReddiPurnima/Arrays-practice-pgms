import java.util.*;
public class sum_using_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]a=new int[5];
        int sum=0;
        System.out.println("enter the values:");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            System.out.println(sum+" ");
        }
    }
}