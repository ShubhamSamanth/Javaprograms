class panarome {
    public static void main(String[] args) {
        String s = "racecar";
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char s2 = s.charAt(i);
            s1 = s1 + s2;
        }
        System.out.println(s1);
        if (s1.equals(s)) {
            System.out.println("panarome");
        } else {
            System.out.println("not a panarome");
        }
    }
}