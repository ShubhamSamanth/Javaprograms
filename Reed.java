import java.util.Scanner;

class Reed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr.length);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                arr[i] = max;
            } else {
                max = arr[i];
                arr[i] = -1;
            }

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}