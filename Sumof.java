class Sumof {
    public static void main(String[] args) {
        int[] arr = { 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int n = 2520;
        int n1 = n;
        int c = 0, d = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    c++;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {

            if (arr[k] == n1) {
                d++;
            }

        }

        System.out.println(c);
        System.out.println(d);

    }
}
