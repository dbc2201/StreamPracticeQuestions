package tasks.task1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.task1.PortalCredentialsCreator;
import tasks.task1.Student;
import tasks.task1.UserName;

import java.util.List;

class PortalCredentialsCreatorTest {

    private PortalCredentialsCreator creator;

    @BeforeEach
    void setUp() {
        creator = new PortalCredentialsCreator();
    }

    @Test
    void createEmptyListOfUserNames() {
        // create an empty list of usernames
        // mark this empty list as the expected value
        var expected = List.<UserName>of();
        // create an empty list of students
        List<Student> students = List.of();
        // use this empty list to call the method being tested
        var actual = creator.createListOfUserNames(students);
        Assertions.assertEquals(expected, actual, "Case #1: method should be able to create empty lists.");
    }

    @Test
    void createListOfRandomPasswords() {
    }
}