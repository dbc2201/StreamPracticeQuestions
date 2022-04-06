package tasks.task2.code;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final long parentContactNumber;
    private byte rollNumber;
    private double marks;

    // No-Argument Constructor -> Default Values Set
    public Student() {
        this.rollNumber = 0;
        this.name = "Nobita Nobi";
        this.parentContactNumber = 132465789L;
        this.marks = 0.0;
    }

    public Student(byte rollNumber, String name, long parentContactNumber, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.parentContactNumber = parentContactNumber;
        this.marks = marks;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public long getParentContactNumber() {
        return parentContactNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && parentContactNumber == student.parentContactNumber && Double.compare(student.marks, marks) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, parentContactNumber, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", parentContactNumber=" + parentContactNumber +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.marks, o.marks);
    }
}
