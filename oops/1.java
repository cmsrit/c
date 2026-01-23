import java.util.Scanner;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class Employee_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[3];

        for (int i = 0; i < 3; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            double salary = sc.nextDouble();
            e[i] = new Employee(id, name, age, salary);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (e[i].age > e[j].age) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(
                "ID: " + e[i].id +
                ", Name: " + e[i].name +
                ", Age: " + e[i].age +
                ", Salary: " + e[i].salary
            );
        }
    }
}
