class cott {
    public static void main(String[] args) {
        int[] arr = { 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int a = 0, c = 0, rem = 0;
        int n = 2501;
        for (int i = 0; i < arr.length; i++) {
            rem = n / arr[i];
            a = a + rem;

            n = n / arr[i];
        }
        System.out.println(rem);

    }

}