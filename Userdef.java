import java.util.Scanner;

public class Userdef {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter the name of the user");
        String name = us.nextLine();
        System.out.println("Enter the age of the user");
        int age = us.nextInt();
        System.out.println(name + " is " + age + " year old.");

    }
}
