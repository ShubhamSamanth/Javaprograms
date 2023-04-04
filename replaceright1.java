class replaceright1 {
    public static void main(String[] args) {
        int[] arr = { 12, 55, 7, 88, 17, 9, 102, 77, 23 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
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