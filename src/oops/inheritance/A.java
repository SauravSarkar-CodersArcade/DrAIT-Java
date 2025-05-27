package oops.inheritance;
class Z {
    void methodZ(){
        System.out.println("Method of class Z");
    }
}
public class A {
    void methodA(){
        System.out.println("Method of class A");
    }
}
class B extends A {
    void methodB(){
        System.out.println("Method of class B");
    }

}
class C extends B{
    void methodC(){
        System.out.println("Method of class C");
    }
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        A a = new A();
        a.methodA();
        System.out.println("----------------------------------------");
        B b = new B();
        b.methodA();
        b.methodB();
        System.out.println("----------------------------------------");
        C c = new C();
        c.methodA();
        c.methodB();
        c.methodC();
        System.out.println("----------------------------------------");
    }
}
