class Makemebig {
    public static void main(String[] args) {
        String a = "207386";
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++)

        {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            int b = ((char) arr[i]);
            System.out.println(b - 48);

        }
        for (char ele : arr) {
            System.out.print(ele);
        }
    }
}