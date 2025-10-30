import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            String s = sc.next();
            char[] arr = s.toCharArray();
            int pos = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == '0') {
                    long dist = i - pos;
                    if (dist <= k) {
                        k -= dist;
                        arr[i] = '1';
                        arr[pos] = '0';
                        pos++;
                    } else {
                        int np= (int)(i - k);
                        arr[i] = '1';
                        arr[np] = '0';
                        break;
                    }
                }
            }
 
            System.out.println(new String(arr));
        }
    }
}