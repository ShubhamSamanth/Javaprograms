class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "(())";
        char[] arr1 = s.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            int c = 0;
            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i] == '(') {
                    System.out.print(arr1[j]);
                    c++;
                    arr1[j] = '\t';

                }
            }
            if (c > 0) {
                System.out.println(arr1[i] + "-->" + c);
            }
        }

    }
}