import java.util.Scanner;

public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private double total;
    private char grade;

    public Student() {
        // Default constructor
    }

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void getUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        this.rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Marks: ");
        this.marks = scanner.nextDouble();
    }

    public void calculate() {
        this.total = this.marks;
        // Assuming grading logic here
        if (this.total >= 90) {
            this.grade = 'A';
        } else if (this.total >= 80) {
            this.grade = 'B';
        } else if (this.total >= 70) {
            this.grade = 'C';
        } else if (this.total >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

    public void printData() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println("Tota

