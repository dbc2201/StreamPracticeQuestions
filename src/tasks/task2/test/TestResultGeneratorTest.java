package tasks.task2.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.task2.code.TestResultGenerator;

import java.util.HashSet;
import java.util.Set;

class TestResultGeneratorTest {

    private TestResultGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new TestResultGenerator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDetailsOfFailedStudents() {
        var expected = new HashSet<>();

        var actual = generator.getDetailsOfFailedStudents(Set.of());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sortStudentsForRanking() {
    }
}