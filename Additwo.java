import java.util.Scanner;

class Additwo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        int sum = 0, ans2, ans1;
        int target = ip.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; i++)

            {
                if (arr[i] + arr[j] == target) {
                    ans1 = arr[i];
                    ans2 = arr[j];
                    System.out.println(i + "  " + j);
                    System.out.println(ans1 + "  " + ans2);
                    break;
                }

            }

        }

    }

}