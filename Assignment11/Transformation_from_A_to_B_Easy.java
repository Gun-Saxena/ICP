import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        List<Long> s=new ArrayList<>();
        s.add(b);
        while (b>a) {
            if(b%10==1) {
                b/= 10;
            } else if(b%2==0) {
                b/=2;
            } else {
                break;
            }
            s.add(b);
        }
        if(b==a) {
            System.out.println("YES");
            Collections.reverse(s);
            System.out.println(s.size());
            for (long x:s) System.out.print(x+ " ");
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }
}