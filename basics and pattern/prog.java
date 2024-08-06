import java.util.*;
public class prog{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count[]=new int[n];
        int ec=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            int t=a[i];
            int flag=0;
            while (t!=0){
                t=t/10;
                flag++;
            }
            count[ec++]=flag;
        }
        for(int i=0;i<ec;i++){
        System.out.print(count[i]+" ");
        };
    }
}