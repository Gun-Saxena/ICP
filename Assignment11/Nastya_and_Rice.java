import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int min1 = n * (a - b);
            int max1 = n * (a + b);
            int t1 = c - d;
            int t2 = c + d;
            if (min1 <= t2 && max1 >= t1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
