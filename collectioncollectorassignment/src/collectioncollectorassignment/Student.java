package collectioncollectorassignment;

public class Student implements Comparable<Student> {
    private String name;
    private int rollNo;
    private int fees;

    public Student(String name, int rollNo, int fees) {
        this.name = name;
        this.rollNo = rollNo;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + ", fees=" + fees + "}";
    }
}
