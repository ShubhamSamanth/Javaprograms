import java.util.Scanner;

class inttt {
    public static void main(String[] args) {
        String[] arr = { "zero", "one ", " two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String s = "";
        int n = 123534;
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            s = arr[rem] + s;
            n = n / 10;
        }
        System.out.println(s);

    }

}