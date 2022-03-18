package tasks.task1.test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.task1.PortalCredentialsCreator;
import tasks.task1.Student;
import tasks.task1.UserName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.util.List.of;

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
        List<Student> students = of();
        // use this empty list to call the method being tested
        var actual = creator.createListOfUserNames(students);
        Assertions.assertEquals(expected, actual, "Case #1: method should be able to create empty lists.");
    }

    private Student createFakeStudent() {
        Faker faker = new Faker(new Locale("en-IND"));
        return new Student((byte) faker.number().randomDigit(), faker.name().firstName(), faker.name().lastName(), (byte) faker.number().numberBetween(1, 4));
    }

    private List<Student> createListOfFakeStudents(int number) {
        List<Student> fakeStudentList = new ArrayList<>();
        for (int index = 0; index < number; index++) {
            fakeStudentList.add(createFakeStudent());
        }
        return fakeStudentList;
    }

    @Test
    void createDistinctUserNames() {
        var fakeStudentList = createListOfFakeStudents(10);
        var expected = creator.createListOfUserNames(fakeStudentList).stream().distinct().toList();
        var actual = creator.createListOfUserNames(fakeStudentList);
        Assertions.assertEquals(expected, actual, "The list of students possibly contains duplicates!");
    }

    @Test
    void createListOfRandomPasswords() {
    }
}