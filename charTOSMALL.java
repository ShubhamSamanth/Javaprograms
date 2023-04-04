import java.util.Scanner;

class charTOSMALL {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String sr = ip.next();
        int sum = 0;
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);
            if (ch >= 65 && ch <= 90) {
                int c = ch + 32;
                char c1 = (char) c;
                System.out.print(c1);
            }
            if (ch >= 97 && ch <= 122) {
                int c = ch - 32;
            }

        }

    }

}