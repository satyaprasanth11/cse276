import java.util.Scanner;
import java.util.Arrays;
public class countingsort{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int k= Arrays.stream(a).max().getAsInt();
        int []count=new int[k+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        for(int i=1;i<k;i++){
            count[i]=count[i]+count[i-1];
        }
        int []b=new int[n];
        for(int i=n-1;i>0;i--){
            b[--count[a[i]]]=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=b[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}