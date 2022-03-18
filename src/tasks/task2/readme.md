# Stream Practice Questions

## Task 2

Create a java class file called `Student.java`. The `Student.java` class should contain the following members:

1. a private field to store the class roll number of a student, as a primitive `byte` type value.
2. a private field to store the name of a student, as a reference `String` type value. **This should be immutable!**
3. a private field to store the parent's/guardian's contact number of a student, as a primitive `long` type value.
   **This should be immutable!**
4. a private field to store the marks, as a primitive `double` type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.

Create a java class file called `TestResultGenerator.java`. The class should contain the following two methods:

1. ```java
   public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {}
   ```
   This method inputs a Set of Student type and returns a HashSet of String type. A single element in the returning
   HashSet will be a String that contains the concatenated name and parent's contact number of a student, e.g.
   ```
   ["Divyansh-1234657890", "Vaibhav-1118529630", "Neeraj-1593574568"]
   ```

2. ```java
   public Set<Student> sortStudentsForRanking(HashSet<Student> studentSet) {}
   ```
   This method inputs a `Set` of `Student` type and returns a `Set` of `Student` type. This method is supposed to sort
   the
   `HashSet` of students in an increasing manner of their marks. Since the marks are primitive `double` type, you are
   supposed to use their natural ordering. If two students have same marks, use class roll number. Create a separate
   execution java class called `Main.java` and call both the methods given above!
