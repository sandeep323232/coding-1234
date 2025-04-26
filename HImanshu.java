// Base class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Student
class Student extends Person {
    String major;

    Student(String name, int age, String major) {
        super(name, age); // Call parent constructor
        this.major = major;
    }

    // Override displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Major: " + major);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age); // Call parent constructor
        this.subject = subject;
    }

    // Override displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Subject: " + subject);
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student("Alice", 20, "Computer Science");
        System.out.println("Student Info:");
        student.displayInfo();

        System.out.println();

        // Create a Teacher
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics");
        System.out.println("Teacher Info:");
        teacher.displayInfo();
    }
}


// and output
// Student Info:
// Name: Alice
// Age: 20
// Major: Computer Science

// Teacher Info:
// Name: Mr. Smith
// Age: 45
// Subject: Mathematics