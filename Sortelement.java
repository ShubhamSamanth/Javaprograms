class Sortelement {

    public static void main(String[] args) {
        int[] arr = { 40, 20, 80, 65, 70, 90, 35, 10 };
        int temp; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}
