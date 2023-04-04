class Demo2 {
    static int x;
    int y;
    static int b;

    static {
        x = 10;
        b = 512;

    }
    static {
        b = 56;
    }
    {
        x = 20;
        y = 56;
    }
}

class MainClass1 {
    public static void main(String[] args) {
        System.out.println(Demo2.x);
        System.out.println(Demo2.b);
        Demo1 d1 = new Demo1();
        System.out.println(d1.x);
        System.out.println(d1.y);

    }

}