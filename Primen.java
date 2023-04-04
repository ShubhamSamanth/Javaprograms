class Primen {
    public static void main(String[] args) {
        int n = 20, c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;

                }
            }

            if (c == 2) {
                System.out.println(i);
            }
        }

    }
}