class fibo {
    public static void main(String[] args) {
        int range = 10;
        int n1 = 0, n2 = 1, n3 = 0;

        while (n3 <= range) {
            System.out.println(n3);
            n3 = n1 + n2;

            n1 = n2;
            n2 = n3;

        }
    }

}