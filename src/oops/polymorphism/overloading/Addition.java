package oops.polymorphism.overloading;
public class Addition {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(float a, float b){
        System.out.println(a+b);
        System.out.println("Float");
    }
    static void add(double a, double b){
        System.out.println(a+b);
        System.out.println("Double");
    }
    public static void main(String[] args) {
        add(1,2);
        add(1.2F,2.7F);
        add(2.45,6.56);
    }
}
