# Stream Practice Questions

## Task 5

Create a java class file called `Teacher.java`. The `Teacher.java` class should contain the following members:

1. a private field to store the employee ID of a teacher, as a reference `String` type value. **IMMUTABLE!**
2. a private field to store the name of a teacher, as a reference `String` type value. **IMMUTABLE!**
3. a private field to store the salary of a teacher, as a primitive `double` type value.
4. a private field to store the list of subjects that the teacher teachers, as a `List<String>` (list of String).
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.

Create a java class file called `TeacherHelper.java`. The class should contain the following two methods:

* ```java
   public List<Teacher> findSubjectTeacher(List<Teacher> allTeachers, String subjectName) {}
   ```
  This method input a List of `Teacher` type as an argument and a `String` type value and returns a list of `Teacher`
  type. This method will find all such teachers in the allTeachers list that have the subject subjectName. Ideally,
  there should be more than a few teachers for the same subject.

* ```java
   public Set<Teacher> getBusyTeachers(List<Teacher> allTeachers) {}
   ```
  This method inputs a `List` of `Teacher` type as an argument and returns a `Set` of `Teacher` type. A busy teacher is
  a teacher that has at least 3 or more subjects to teach. If the list contains duplicate elements, make sure that the
  duplicate items are not returned from the method. Increase the salary of such teachers by 5% Create a separate
  execution java class called `Main.java` and call both the methods given above!
