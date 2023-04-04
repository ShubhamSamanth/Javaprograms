import java.util.Scanner;

class charec {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String sr = ip.next();
        int sum = 0;
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int c = ch - 48;
                sum = c + sum;
            }

        }
        System.out.println("The Sum of numbers is:" + " " + sum);
    }
}