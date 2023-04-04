class ssss {
    public static void main(String[] args) {
        int[] arr = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int n = 2000;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                c++;
            }

        }
        System.out.println(c);

    }

}
