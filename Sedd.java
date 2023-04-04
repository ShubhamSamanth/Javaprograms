class Sedd {
    public static void main(String[] args) {
        int[] arr = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int n = 1251;
        int sum = 0, c = 0;

        for (int i = 0; i < arr.length; i++) {
            c = n / arr[i];
            sum = sum + c;
            n = n % arr[i];
        }
        System.out.println("The total count is = " + sum);

    }

}