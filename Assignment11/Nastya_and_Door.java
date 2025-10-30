import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] p=new int[n];
            for(int i=1;i<=n-2;i++){
                if(a[i-1]<a[i] && a[i]>a[i+1]){
                    p[i]=1;
                }
            }
            int[] pre=new int[n+1];
            for(int i=0;i<n;i++){
                pre[i+1]=pre[i]+p[i];
            } 
            int b=-1;
            int l=0;
            for (int j=0;j+k-1<n;j++) {
                int l_in=j+1;
                int r_in=j+k-2;
                int cnt=0;
                if(l_in<=r_in) {
                    cnt=pre[r_in+1]-pre[l_in];
                }
                if(cnt>b) {
                    b=cnt;
                    l=j;
                }
            }
            System.out.println((b+1)+" "+(l+1));
        }
    }
}