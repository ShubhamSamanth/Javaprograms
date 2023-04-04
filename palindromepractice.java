class palindromepractice {
    public static void main(String[] args) {
        int n = 101, n1 = n, rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
        if (rev == n1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a Palindrome");
        }
    }

}