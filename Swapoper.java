class Swapoper {
    public static void main(String[] args) {
        char ch = '@';
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("its a character");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("its numeric");
        } else {
            System.out.println("other");
        }
    }
}