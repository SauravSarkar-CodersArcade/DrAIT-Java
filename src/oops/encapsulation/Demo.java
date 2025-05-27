package oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Raman");
        s1.setEmail("raman@gmail.com");
        s1.setRollNo(123);
        System.out.println(s1.getName());
        System.out.println(s1.getEmail());
        System.out.println(s1.getRollNo());
    }
}
