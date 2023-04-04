class DigitPrime {
    static boolean isprime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n1 = 2678, c = 0, rem = 0, sum = 0;

        while (n1 > 0) {
            rem = n1 % 10;
            System.out.println(rem + "==");

            if (isprime(rem)) {
                System.out.println(rem + "====");

                sum = sum + rem;
            }

            n1 = n1 / 10;
        }

        System.out.println(sum);
    }
}