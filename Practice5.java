class Practice5 {
    public static void main(String[] args) {
        String[] str = { "rajkumhg", "spegd", "cow", "highspeed" };
        int max = str[0].length();
        String largest = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= max) {
                largest = str[i];
                max = str[i].length();

            }

        }
        System.out.println(largest);

    }
}