class demp {
    static int x;
    static int y;
    int z;

    demp() {
        x = 22;
        y = 23;
        z = 32;

    }

}

class MainClass12 {
    public static void main(String[] args) {
        demp d1 = new demp();
        System.out.println(demp.x);
        System.out.println(demp.y);
        System.out.println(d1.z);

    }

}