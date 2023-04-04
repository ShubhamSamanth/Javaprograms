class AmrstrongPractice {
    public static void main(String[] args) {
        int n = 153, n1 = n, c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        System.out.println(c);
        int rem = 0, sum = 0;
        while (n1 != 0) {
            rem = n1 % 10;
            int pow = 1;
            for (int i = 1; i <= c; i++) {
                pow = pow * rem;
            }
            sum = sum + pow;
            n1 = n1 / 10;
        }
        System.out.println(sum);

    }
}