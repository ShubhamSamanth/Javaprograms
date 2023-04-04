class Prime {
    public static void main(String[] args) {
        int n = 5679, sum = 0, b = 0;
        while (n > 0) {
            int sum1 = n % 10;
            sum = sum + sum1;
            n = n / 10;
            System.out.println(sum);
        }
        for (int i = 1; i <= sum; i++)
            if (sum % i == 0) {
                b++;
            }
        if (b == 2) {
            System.out.println("its a prime");
        } else {
            System.out.println("not prime");
        }

    }

}