# Stream Practice Questions

## Task 13

Create a java class file called `Question.java`. The `Question.java` class should contain the following members:

1. a private field to store the question ID, as a primitive `int` type value.
2. a private field to store the text of the question, as a reference `String` type value.
3. a private field to store the list of options (a, b, c or d), `List<String>` (List of String) for options.
4. a private field to store the correct options, as a primitive `char` type value.
5. a private field to store the marks of the question, as a primitive `byte` type value.
6. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.

Create a java class file called `TestGenerator.java`. The class should contain the following two methods:

* ```java
  public HashSet<Question> fetchQuestionList(List<Question> allQuestions, byte marks) {}
  ```
  This method will iterate through the allQuestions list and find all the questions that have the same marks as the
  `marks` argument, and return a `HashSet` of the questions, the marks can not be greater than 10, the returning hash
  set cannot be null, and there should be not duplicate values in the hash set.
* ```java
  public HashSet<Question> createTest(List<Question> allQuestions) {}
  ```
  This method will fetch 10 random questions from the list of all questions, but make sure that, the returning set of
  questions cannot be null, cannot have duplicate elements, and the total sum of the marks of all the questions cannot
  be greater than 50.

Create a separate execution java class called `Main.java` and call both the methods given above