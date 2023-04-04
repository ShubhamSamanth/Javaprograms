class Repeat {
    public static void main(String[] args) {
        int n = 7556, rem = 0;
        while (n != 0) {
            rem = n % 10;
            System.out.println(rem);
            n = n / 10;

        }
    }
}