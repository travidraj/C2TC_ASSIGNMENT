package entityclassasignment1;

public class Student1 {
	public int rollNo;
    public String name;
    public String department;

    public Student1(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Department: " + department);
    }
}
