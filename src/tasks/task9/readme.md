# Stream Practice Questions

## Task 9

Create a java class file called `Patient.java`. The `Patient.java` class should contain the following members:

1. a private field to store the patient id, as a primitive `short` type value.
2. a private field to store the name of the patient, as a reference `String` type value. **IMMUTABLE**
3. a private field to store the age of the patient, as a primitive `byte` type value.
4. a private field to store the contact number of the patient, as a primitive `long` type value. **IMMUTABLE**
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.


* Create a java class file called `PatientHelper.java`. The class should contain the following two methods:

* ```java
  public Set<Patient> getAllOldPatients(List<Patient> patients) {}
  ```
  This method will return all the patients whose age is at least 60 or above. If there is no such patient, make sure
  that the method does not return `null`. The method should not return duplicate items as well.

* ```java 
  public List<Patient> sortPatientsAccordingToDecreasingAge(List<Patient> patients) {}
  ```
  This method will sort the patients' list according to decreasing age, a patient with a greater age should come first
  in the list. Use either a lambda expression or a method reference to do this.

Create a separate execution java class called `Main.java` and call both the methods given above!
