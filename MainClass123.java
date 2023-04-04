class nprime {

    static boolean prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }

        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

    class MainClass123 {
        public static void main(String[] args) {
            int c = 0;
            int key = 6;
            for (int i = 1;; i++) {
                if (prime(i) == true) {
                    c++;
                }
            }
            if (c == key) {
                System.out.println(i);
                break;
            }
        }
    }
}
