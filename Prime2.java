import java.util.Scanner;

class Prime2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int rem = 0, c = 0;
        while (n != 0) {
            rem = n % 10;
            c++;
            if (rem)
                n = n / 10;
        }
        System.out.println(c);
    }
}