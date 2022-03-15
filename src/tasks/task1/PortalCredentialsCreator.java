package tasks.task1;

import java.util.List;

public class PortalCredentialsCreator {
    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        return studentsList.stream().map(this::createUserName).toList();
    }

    private UserName createUserName(Student student) {
        var firstName = student.getFirstName();
        var lastName = student.getLastName();
        var classRollNumber = student.getClassRollNumber();
        var currentYear = student.getCurrentYear();
        var userNameString = String.format("%s.%s.%d.%d", firstName, lastName, currentYear, classRollNumber);
        return new UserName(userNameString);
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return List.of();
    }
}
