class armsss {
    public static void main(String[] args) {

        int n = 407, c = 0, n1 = n, temp = n, rem = 0, pow, sum = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        while (n1 != 0) {
            rem = n1 % 10;
            pow = 1;
            for (int i = 1; i <= c; i++) {
                pow = pow * rem;
            }
            sum = sum + pow;
            n1 = n1 / 10;
        }
        if (temp == sum) {
            System.out.println("number " + temp + " its arm");
        } else {
            System.out.println("not arm");
        }

    }
}