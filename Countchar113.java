class Countchar113{
    static boolean palindrome(String s) {
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }
        if (s.equals(s2)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "abxb";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = "" + s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                temp = temp + s.charAt(j);
                System.out.println(temp);
                if (palindrome(temp)) {
                    if (ans.length() < temp.length())
                        ans = temp;
                }
            }

        }
        System.out.println("Largest number is:" + ans);

    }

}