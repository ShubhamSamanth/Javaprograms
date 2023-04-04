import java.util.Scanner;

public class Addit {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the value of 1");
        double b = a.nextDouble();
        System.out.println("Enter the next number");
        int c = a.nextInt();
        Double Sum = b + c;
        System.out.println(Sum);

    }

}