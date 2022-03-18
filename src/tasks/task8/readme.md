# Stream Practice Questions

## Task 8

Create a java class file called `Book.java`. The `Book.java` class should contain the following members:

1. a private field to store the ISBN-number of the book, as a reference `String` type value. **IMMUTABLE**
2. a private field to store the name of the book, as a reference `String` type value. **IMMUTABLE**
3. a private field to store the name of the author of the book, as a reference `String` type value.
4. a private field to store the subject of the book, as a reference `String` type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString(`) and the `hashCode()` methods.

Create a java class file called `BooksHelper.java`. The class should contain the following two methods:

* ```java
  public List<Book> findAllBooksOnSubject(Set<Book> books, String subject) {}
  ```
  This method will find all the books on the specified subject, the returned list should not return `null`
  AND it should not have any duplicate values.

* ```java
  public List<Book> sortBooks(Set<Book> books) {}
  ```
  This method will sort the set of books provided to this method on the basis of their subjects.

Create a separate execution java class called `Main.java` and call both the methods given above!
