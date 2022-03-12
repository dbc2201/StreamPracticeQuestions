package tasks.task1;

import java.util.Objects;

public class Student {
    private byte classRollNumber;
    private String firstName;
    private String lastName;
    private byte currentYear;

    public Student(byte classRollNumber, String firstName, String lastName, byte currentYear) {
        this.classRollNumber = classRollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentYear = currentYear;
    }

    public byte getClassRollNumber() {
        return classRollNumber;
    }

    public void setClassRollNumber(byte classRollNumber) {
        this.classRollNumber = classRollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(byte currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return classRollNumber == student.classRollNumber && currentYear == student.currentYear && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classRollNumber, firstName, lastName, currentYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "classRollNumber=" + classRollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", currentYear=" + currentYear +
                '}';
    }
}
