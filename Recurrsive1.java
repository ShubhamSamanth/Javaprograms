class Recurrsive1 {
    static int sum = 0;

    static int func(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + func(n - 1);
        }

    }

    public static void main(String[] args) {

        System.out.println(func(10));

    }

}