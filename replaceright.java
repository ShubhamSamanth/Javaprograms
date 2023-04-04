class replaceright {
    public static void main(String[] args) {
        int[] arr = { 12, 8, 99, 17, 18, 10, 2, 11, 1 };
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                arr[i] = max;

            } else {
                max = arr[i];
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}