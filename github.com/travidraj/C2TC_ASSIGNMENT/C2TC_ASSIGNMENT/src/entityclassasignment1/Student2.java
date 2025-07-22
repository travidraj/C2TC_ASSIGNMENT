package entityclassasignment1;

public class Student2 {
	public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Arun", "IT");
        Student1 s2 = new Student1(102, "Divya", "CSE");
        Student1 s3 = new Student1(103, "Kiran", "ECE");

        System.out.println("Student Details:");
        s1.display();
        s2.display();
        s3.display();
    }
}
