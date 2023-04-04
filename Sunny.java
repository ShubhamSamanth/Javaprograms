class Sunny {
    public static void main(String[] args) {
        int n = 7;
        boolean flag = false;
        for (int i = 1; i <= n + 1; i++) {
            if (n + 1 == i * i) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("sunny");
        }

        else {
            System.out.println("not sun");
        }
    }

}