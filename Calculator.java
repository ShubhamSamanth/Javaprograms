import java.util.Scanner;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int subs(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println("======Welcome to Simple Calculator====== ");
        Scanner t = new Scanner(System.in);
        System.out.println("menu");
        while (true) {
            System.out.println("1.add\n2.sub\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
            System.out.println("Enter the option");
            int op = t.nextInt();
            int a = 0, b = 0;
            if (op >= 1 && op <= 5) {
                System.out.println("Emter the number 1");
                a = t.nextInt();

                System.out.println("Emter the number 2");
                b = t.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println(" The addition of  " + a + "  and   " + b + "  i s     " + add(a, b));
                    break;
                case 2:
                    System.out.println(subs(a, b));
                    break;
                case 3:
                    System.out.println(mul(a, b));
                    break;
                case 4:
                    System.out.println(div(a, b));
                    break;
                case 5:
                    System.out.println(mod(a, b));
                    break;
                case 6:
                    System.out.println("Exit");
                    System.out.println("Thank you visit again");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid");
                    

            }

        }

    }
}
