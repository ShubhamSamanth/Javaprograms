class Sunnynum {
    public static void main(String[] args) {
        int n = 80, c = 0;

        for (int i = 1; i <= n; i++) {
            if (n + 1 == i * i) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("sunny num");
        } else {
            System.out.println("not sunny");
        }
    }

}