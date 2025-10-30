
import java.util.*;
public class Main {
    static int total(String s) {
        int sum=0;
        for(char c:s.toCharArray()) {
            if(c=='+') sum++;
            else if(c=='-') sum--;
        }
        return sum;
    }
    static double fact(int n) {
        double res=1;
        for (int i=1;i<=n;i++) res*=i;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int t=total(s1);
        int curr=0,q = 0;
        for(char c : s2.toCharArray()) {
            if (c=='+') curr++;
            else if (c == '-') curr--;
            else q++; 
        }
        int d= t-curr;
        if ((d+q)%2!=0||Math.abs(d)>q) {
            System.out.println(0.0);
            return;
        }
        int k = (d+ q) / 2;
        double com=fact(q)/(fact(k)*fact(q - k));
        double ans=com/Math.pow(2, q);
 
        System.out.printf("%.12f\n", ans);
    }
}