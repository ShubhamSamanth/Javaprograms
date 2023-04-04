class Armst {

    public static void main(String[] args) {
        int n = 407, rem = 0, sum = 0;
        int temp = n, c = 0, n1 = n;
        while (n != 0) {
            n = n / 10;
            c++;

        }
        while (n1 != 0) {
            rem = n1 % 10;
            int pow = 1;
            for (int i = 1; i <= c; i++) {

                pow = pow * rem;
            }
            sum = sum + pow;
            n1 = n1 / 10;
        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println("Its a Armstrong");
        } else {
            System.out.println("not a Armstrong");
        }
    }
}