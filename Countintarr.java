class Countintarr {
    static boolean isprime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 41, 30, 40, 50, 10, 20, 30, 1, 2, 3, 41 };
        int[] arr2 = { 10, 20, 41, 30, 40, 50, 10, 20, 30, 1, 2, 3, 41 };
        int sum = 0, sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            int c = 0;
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    c++;
                    arr2[j] = 0;

                }
            }
            if (c > 1) {
                sum = sum + arr1[i];
            }
            if (c >= 1) {
                sum1 = sum1 + arr1[i];
            }
        }
        System.out.println(sum);
        if (isprime(sum)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        System.out.println("===================");
        System.out.println(sum1);
        if (isprime(sum1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}