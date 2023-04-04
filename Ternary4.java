class Ternary4 {
    public static void main(String[] args) {
        int a = 12, b = 34, c = 554,d=564,res = 0;
        res = (a > b && a > c &&a>d ? a : b > c && b>d? b : c>d?c:d);
        System.out.println(res);

    }
}