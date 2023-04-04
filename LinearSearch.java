class LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        int pos = -1;
        int found = 205;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == found) {
                pos = i;
                System.out.println(arr[i] + " found the value at  " + (i));
                break;
            }
        }
        if (pos == -1) {
            System.out.println("not found");
        }
    }
}