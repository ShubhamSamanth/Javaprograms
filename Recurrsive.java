class Recurrsive {
    static int sum = 0;

    static void func(int n) {
        if (n >= 1) {
            sum = sum + n;
            n--;
            func(n);
        } else {
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        func(10);

    }

}