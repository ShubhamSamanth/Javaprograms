class primenoprint {
    public static void main(String[] args) {
        int range = 20, c = 0;
        for (int i = 1; i <= range; i++) {
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