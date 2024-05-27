package ComparatorandStreams;

public class Student {
    String name;
    int rollnumber;
    int marks;

    public Student(String name, int rollnumber, int marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "[Name= " + this.name + ",RollNumber= " + rollnumber + ",Marks= " + marks + "]";
    }
}
