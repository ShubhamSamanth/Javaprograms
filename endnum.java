class endnum {
    public static void main(String[] args) {
        int n = 1234567891;
        int rem = 0, c = 0, odd = 0;
        while (n != 0) {
            rem = n % 10;
            if (rem % 2 == 1) {
                c++;
            } else {
                odd++;
            }
            n = n / 10;
        }
        System.out.println(odd);
        System.out.println(c);

    }
}