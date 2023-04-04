class d1 {
    public static void main(String[] args) {
        String s = "raj";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 = s.charAt(i) + s1;
        }
        System.out.println(s1);
    }
}