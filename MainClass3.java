class Demo1 {
    static int x = 10;
    int y = 20;

}

class MainClass3 {

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        System.out.println(Demo1.x);
        System.out.println(d1.y);
        Demo1.x = 40;
        System.out.println(Demo1.x);
        new Demo1().y = 70;
        System.out.println(d1.y);
    }
}