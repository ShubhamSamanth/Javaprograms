import java.util.Scanner;

class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        String lar = "";
        int max = arr[0].length();
        System.out.println("==================");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                lar = arr[i];
            }
        }
        System.out.println(lar);

    }
}