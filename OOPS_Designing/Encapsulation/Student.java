package OOPS_Designing.Encapsulation;

public class Student {
    // Attributes
    public int id;
    private int age;
    public String name;
    public int nos;
    private String friends;

    // Getters
    public int getAge() {
        return this.age;
    }

    // Setters
    public void setAge(int a) {
        // extra layer of authentication
        if(age < 100) {
            this.age = a;
        }
        return;
    } 

    // Default Constructor
    public Student() {
        System.out.println("Student Default Constructor Called");
    }

    // Parameterized Constructor
    public Student(int id, int age, String name, int nos, String friends) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.friends = friends;
    }

    // Methods
    public void study() {
        System.out.println("Studying");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void bunk() {
        System.out.println("Bunking");
    }

    private void friendChatting() {
        System.out.println("friendChatting");
    }
}
