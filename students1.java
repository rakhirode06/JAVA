public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private double total;
    private char grade;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.calculate();
    }

    public void calculate() {
        this.total = this.marks;
       
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
        System.out.println("Total: " + this.total);
        System.out.println("Grade: " + this.grade);
    }

    public static void main(String[] args) {
        
