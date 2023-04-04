import java.util.Scanner;

class Ciggs1 {

    public static void main(String[] args) {
        System.out.println("=========================== ");
        System.out.println("======Welcome to Shop====== ");
        System.out.println("=========================== ");
        Scanner t = new Scanner(System.in);
        while (true) {
            System.out.println("1.Paytm\n2.Gpay\n3.Phonepe\n4.Debitcard");
            System.out.println("-----------------------               ");
            System.out.println("Enter the  Payment option");
            int op = t.nextInt();
            int a = 0;
            if (op >= 1 && op <= 4) {
                System.out.println("Enter the number of Cigs");
                a = t.nextInt();
                int s = a * 18;
                int Moneyin = 0;
                System.out.println("Enter money");
                int n = t.nextInt();
                if (n >= s) {

                    System.out.println("Money is Sufficient");
                    System.out.println("Money Debited:" + s);
                    Moneyin = n - s;
                    System.out.println("Balance:" + Moneyin);
                    System.out.println("Thank you visit again");
                    System.exit(0);

                } else {
                    System.out.println("Insufficient money");
                    System.out.println("Cool You can Buy one Cig");
                    System.out.println("Money Debited:" + 18);
                    Moneyin = n - s;
                    System.out.println("Balance:" + (n - 18));
                    System.out.println("Add money to the Account");
                    System.out.println("--------------------------");
                    System.out.println("Thank you visit again -- Next Time add Money");
                    System.exit(0);
                }
            }

        }

    }
}
