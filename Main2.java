class check {
    static char d;

    check() {
        d = 'p';
    }
}

class Main2 {
    public static void main(String[] args) {
        check c1 = new check();
        System.out.println(check.d);
    }
}
