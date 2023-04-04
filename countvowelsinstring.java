class countvowelsinstring {
    public static void main(String[] args) {
        String s = "ygseiy6595%^57";
        String s1 = s.toLowerCase();
        int c = 0, d = 0, e = 0, f = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            } else if (ch >= '0' && ch <= '9') {
                d++;
            } else if (ch >= 'a' && ch <= 'z') {
                f++;
            } else {
                e++;
            }
        }
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

}