package classes;

public class StaticKeyword {

    public static void main(String[] args) {
        // calling m1 without creating any object of class Test
        m1();

        System.out.println("from main");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
    //static method
    static void m1() {
        System.out.println("from m1");
    }


    // static variable
    static int a = 10;
    static int b;

    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }


}
