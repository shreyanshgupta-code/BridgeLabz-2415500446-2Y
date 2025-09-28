public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Shreyansh", 101, 92.5);
        Student s2 = new Student("Aarav", 102, 68);
        Student s3 = new Student("Priya", 103, 45);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
        System.out.println();
        s3.displayDetails();
    }
}
