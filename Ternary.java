class Ternary {
    public static void main(String[] args) {
        int a = 12, b = 34, c = 554, res = 0;
        res = (a > b && a > c ? a : b > c ? b : c);
        System.out.println(res);

    }
}