# Stream Practice Questions

## Task 7

Create a java class file called `Book.java`. The `Book.java` class should contain the following members:

1. a private field to store the ISBN-number of the book, as a reference `String` type value. **IMMUTABLE**
2. a private field to store the name of the book, as a reference `String` type value. **IMMUTABLE**
3. a private field to store the name of the author of the book, as a reference `String` type value.
4. a private field to store the price of the book, as a primitive `double` type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.

   Create a java class file called `CollegeLibrary.java`. The class should contain the following two methods:

* ```java
   public List<Book> getListOfExpensiveBooks(Set<Book> books) {} 
   ```
  This method input a `Set` of `Book` type and returns a `List` of `Book` type. An expensive book is a book whose price
  is at least 5,000 INR or more. If such a book exists, make sure that the returning list should not have duplicate
  names. If there are two books by the same author, even with different names, they should be considered as same.

* ```java
   public Book findBookDetailsByISBN(List<Book> books, String ISBN) {}
   ```
  This method will find a book by the ISBN-number and return it. Make sure even if there is not such book, the method
  should not return `null`.

  Create a separate execution java class called `Main.java` and call both the methods given above!
