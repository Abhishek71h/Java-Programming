package OOPS_Designing.Encapsulation;

public class App {
    public static void main(String args[]) {
        Student A = new Student(1, 12, "Rahul", 3, "Aman");
        System.out.println("Name of Student is: " + A.name);
        System.out.println("Id of Student is: " + A.id);
        System.out.println("Nos of Student is: " + A.nos);

        A.setAge(12);
        System.out.println("Age of Student is: " + A.getAge());
    }
}