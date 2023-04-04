class Sunny1 {
    public static void main(String[] args) {
        int n = 9;
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            if (n == i * i) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("perfect");
        }

        else {
            System.out.println("not perfect");
        }
    }

}