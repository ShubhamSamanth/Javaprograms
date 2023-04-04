class Demo1 {
    static int x;
    int y;
    static int b;

    {
        x = 10;
        b = 512;
        y = 20;
    }

}

class MainClass {
    public static void main(String[] args) {
        System.out.println(Demo1.x);
        System.out.println(Demo1.b);
        Demo1 d1 = new Demo1();
        System.out.println(d1.y);

    }

}