# Stream Practice Questions

## Task 1

Create a java class file called `Student.java`. The `Student.java`
class should contain the following members:

1. a private field to store the class roll number of a student, as a primitive `byte` type value.
2. a private field to store the first name of a student, as a reference `String` type value. **This should be
   immutable!**
3. a private field to store the last name of a student, as a reference `String` type value. **This should be
   immutable!**
4. a private field to store the current year of a student, as a primitive `byte` type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the equals(),
   toString() and the hashCode() methods. Create a java class file called `PortalCredentialsCreator.java`. The class
   should contain the following two methods:
6. ```java
   public List<UserName> createListOfUserNames(List<Student> studentsList) {}
   ```
   This method inputs a list of Student type defined above, and creates a list of UserName type. Create a java class
   file called `UserName.java` and create a private field called userName, to store the user name of a student as a
   reference
   `String` value. No two usernames in the list should be the same.
7. ```java
   public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {}
   ```
   This method inputs a list of Student type defined above, and creates a list of `PassWord type`. Create a java class
   file called PassWord.java and create a private field called passWord, to store the password of a student as a
   reference
   `String value`. The value of a password should be a random string of length 8-20.

* Create a separate execution java class called `Main.java` and call both the methods given above!
