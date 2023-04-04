public class prime1 {
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
        int[] arr = { 3733 };
        for (int i = 0; i < arr.length; i++) {
            boolean a = isprime(arr[i]);

            if (a == true) {
                System.out.println("its prime");
            }
        }
    }
}
