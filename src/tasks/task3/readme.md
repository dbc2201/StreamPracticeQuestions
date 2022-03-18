# Stream Practice Questions

## Task 3

Create a java class file called `Employee.java`. The `Employee.java` class should contain the following members:

1. a private field to store the employee id of an employee, as a primitive `short` type value. **This should be
   immutable!**
2. a private field to store the name of an employee, as a reference `String` type value. **This should be immutable!**
3. a private field to store the salary of an employee, as a primitive `double` type value.
4. a private field to store the number of leaves taken by an employee, as a primitive `byte` type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods. Create a java class file called `EmployeeLeaveCalculator.java`.

   The class should contain the following two methods:
6. ```java
   public List<Short> getDefaulterEmployeeIDList(List<Employee> employeeList) {}
   ``` 
   This method inputs a list of `Employee` as an argument and returns a list of employee IDs (as `short`)
   where the employee is a "defaulter", an employee is considered to be a defaulter, if they have taken more than 25
   leaves. Make sure that the list does not contain duplicate elements! Decrease their salary by 1%.
7. ```java
   public ArrayList<String> getNumberOfLeaves(List<Employee> employeeList) {}
   ```
   This method inputs a list of `Employee` type as an argument and returns an `ArrayList` of `String` type. The `String`
   in the `ArrayList` will contain the name of the employee and the total number of leaves taken by the employee. e.g
   ```
   ["Divyansh-5", "Neeraj-5", "Vaibhav-8"]
   ```
   Sort this list according to the number of leaves, use name for ambiguity. Create a separate execution java class
   called `Main.java` and call both the methods given above!
