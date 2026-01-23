class Student {
    private String name;
    private int age;

    Student() {
        this.name = "";
        this.age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing Student object: " + this.name);
        super.finalize();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        final char section = 'D';

        Student s1 = new Student();
        s1.setName("John Doe");
        s1.setAge(20);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge() + "\nSection: " + section);

        Student s2 = new Student("Jane Doe", 22);
        System.out.println("Name: " + s2.getName());
        System.out.println("Age: " + s2.getAge());
    }
}
