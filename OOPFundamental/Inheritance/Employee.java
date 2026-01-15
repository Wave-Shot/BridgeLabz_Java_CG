class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + duration);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 1, 80000, 5);
        Employee e2 = new Developer("Bob", 2, 60000, "Java");
        Employee e3 = new Intern("Charlie", 3, 20000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
