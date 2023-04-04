import java.util.Scanner;

class Recurrsive2 {
    static int fact = 1;

    static void func(int n) {
        if (n >= 1) {
            fact = fact * n;
            n--;
            func(n);
        } else {
            System.out.println("The factorial is:" + fact);
        }

    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = ip.nextInt();
        func(n);

    }

}