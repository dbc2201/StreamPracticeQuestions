package tasks.task1.code;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

/**
 * It creates a portal user and assigns it a password.
 */
public class PortalCredentialsCreator {
    /**
     * Create a list of user names from a list of students
     *
     * @param studentsList the list of students to be processed
     * @return A list of UserName objects.
     */
    /**
     * Create a list of user names from a list of students
     *
     * @param studentsList the list of students to be processed
     * @return A list of UserName objects.
     */
    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        return studentsList.stream()
                .map(this::createUserName)
                .toList();
    }

    /**
     * Create a user name from a student's first name, last name, current year, and class roll number
     *
     * @param student The student object that we want to create a user name for.
     * @return Nothing.
     */
    private UserName createUserName(Student student) {
        var firstName = student.getFirstName();
        var lastName = student.getLastName();
        var classRollNumber = student.getClassRollNumber();
        var currentYear = student.getCurrentYear();
        var userNameString = String.format("%s.%s.%d.%d", firstName, lastName, currentYear, classRollNumber);
        return new UserName(userNameString);
    }

    /**
     * Create a list of passwords for each student in the list of students
     *
     * @param studentsList The list of students to create passwords for.
     * @return A list of PassWord objects.
     */
    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return studentsList.stream()
                .map(this::createStringPassword)
                .map(PassWord::new)
                .toList();
    }

    /**
     * Create a random alphanumeric string of length 16
     *
     * @param student The student object that we want to create a password for.
     * @return A String
     */
    private String createStringPassword(Student student) {
        return RandomStringUtils.randomAlphanumeric(16);
    }
}
