class Primenum {
    public static void main(String[] args) {
        int n = 91, c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("prime num");
        } else {
            System.out.println(" NOt prime num");
        }
    }

}