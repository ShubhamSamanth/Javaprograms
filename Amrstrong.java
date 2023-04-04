class Amrstrong {
    public static void main(String[] args) {
        int n = 370, n1 = n, n2 = n, sum = 0, c = 0, rem = 0;
        while (n != 0) {
            c++;
            n = n / 10;
        }
        while (n1 != 0) {
            rem = n1 % 10;
            int pow = 1;
            for (int i = 1; i <= c; i++) {
                pow = pow * rem;
            }
            sum = sum + pow;
            n1 = n1 / 10;
        }
        if (n2 == sum) {
            System.out.println("Its a Armstrong number");
        } else {
            System.out.println("Its not a Armstrong number");
        }

    }
}