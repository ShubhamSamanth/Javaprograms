class EvenCount {
    public static void main(String[] args) {
        int n = 12368, c = 0, rem = 0;
        while (n != 0) {
            rem = n % 10;
            if (rem % 2 == 1) {
                c++;
            }
            n = n / 10;
        }
        System.out.println(c);
    }

}