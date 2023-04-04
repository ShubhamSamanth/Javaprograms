import java.util.Scanner;

class Cigg {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a Money");
        int n = ip.nextInt();
        int op = ip.nextInt();
        System.out.println("Enter payment method");
        while (true) {
            System.out.println("1.Paytm\n2.Gpay\n3.Phonepe\n4.Debitcard");
            System.out.println("Enter the option");
            if (op >= 1 && op <= 4) {
                System.out.println("Emter the number 1");
                String a = ip.next();
                System.out.println(a);

            }
            int Moneyin = 0;

            if (n >= 20) {
                System.out.println("Money is Sufficient");
                Moneyin -= n;
                System.out.println(Moneyin);
            }

            else if (n < 20) {
                System.out.println("Insufficient money");
                System.out.println("Add money to the Account");
                System.out.println("--------------------------");
            }

        }
    }
}