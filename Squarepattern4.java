class Squarepattern4 {
    public static void main(String[] args) {
        int i, j, n = 9;
        for (i = n ; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
