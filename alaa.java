class alaa {
    public static void main(String[] args) {
        int[] ar1 = { 1, 2 };
        int[] ar2 = { 2, 3 };
        int sum = 0, sum1 = 0;
        for (int i = 0; i < ar1.length; i++) {
            sum = sum + ar1[i];
        }
        for (int i = 0; i < ar2.length; i++) {
            sum1 = sum1 + ar1[i];
        }
        if (sum >= sum1) {
            System.out.println(sum);
        } else {
            System.err.println(sum1);
        }

    }
}
