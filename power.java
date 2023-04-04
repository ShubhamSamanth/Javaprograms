class power {
    public static void main(String[] args) {

        int exp = 3, base = 2, pow = 1;
        for (int i = 1; i <= exp; i++) {
            pow = pow * base;
        }
        System.out.println(pow);
    }
}
