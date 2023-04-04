class Sunnynum {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = false;

        for (int i = 1; i <= n + 1; i++) {

            if (n + 1 == i * i) {
                flag = true;

            }
        }

        if (flag == true) {
            System.out.println("sunny num");
        } else {
            System.out.println("not sunny");
        }

    }
}
