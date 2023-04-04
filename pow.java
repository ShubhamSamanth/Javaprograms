class pow {
    static int power() {
        int power = 1, exp = 3, base = 2;
        for (int i = 1; i <= exp; i++) {
            power = power * base;
        }
        return power;
    }

    public static void main(String[] args) {
        System.out.println(power());

    }
}