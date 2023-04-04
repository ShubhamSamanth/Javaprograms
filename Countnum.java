class Countnum {
    public static void main(String[] args) {
        int n = 848788, c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        System.out.println(c);

    }
}