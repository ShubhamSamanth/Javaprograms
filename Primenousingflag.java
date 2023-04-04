class Primenousingflag {
    static boolean isprime(int n1) {
        int c = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int rem = 0, sum = 0, n = 51212;
        while (n != 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
        if (isprime(sum) == true) {
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }

    }

}