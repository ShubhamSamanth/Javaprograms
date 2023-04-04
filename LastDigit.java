import java.util.*;

class LastDigit {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();

        int rem = 0;
        for (int i = 1; i <= 3; i++) {
            rem = n % 10;

            n = n / 10;
        }
        System.out.println(rem);
    }
}