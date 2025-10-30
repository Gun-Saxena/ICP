import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); 
        int max = 1000000;
        int[] g = new int[max + 1];
        
        for (int i = 1; i <= max; i++) {
            g[i] = fun(i);
        }
        int[][] pre = new int[10][max + 1];
        for (int k = 1; k <= 9; k++) {
            for (int i = 1; i <= max; i++) {
                pre[k][i] = pre[k][i - 1] + (g[i] == k ? 1 : 0);
            }
        }
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(pre[k][r] - pre[k][l - 1]);
        }
    }
    static int fun(int x) {
        while (x >= 10) {
            int prod = 1;
            int y = x;
            while (y > 0) {
                int d = y % 10;
                y /= 10;
                if (d != 0) prod *= d;
            }
            x = prod;
        }
        return x;
    }
}
