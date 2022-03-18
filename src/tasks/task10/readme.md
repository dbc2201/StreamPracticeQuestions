# Stream Practice Questions

## Task 10

Create a java class file called `Patient.java`. The `Patient.java` class should contain the following members:

1. a private field to store the patient id, as a primitive `short` type value. **IMMUTABLE**
2. a private field to store the name of the patient, as a reference `String` type value.
3. a private field to store the result of the patient, as a primitive `boolean` type value.
4. a private field to store the contact number of the patient, as a primitive `long` type value. **IMMUTABLE**
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.

Create a java class file called `TestGenerator.java`. The class should contain the following two methods:

* ```java
  public Set<Patient> getAllPositivePatients(List<Patient> allPatients) {}
  ```
  This method will return all the patients whose results have come out as positive. If there are no such patients, make
  sure that the method does not return `null`, it should also not return any duplicate values.
* ```java
  public Patient findPatient(List<Patient> patients, short patientID) {}
  ```
  This method will return all the details of a patient by searching for them in the list of patients using their patient
  ID, if there is no such patient, the method should not return `null`.

Create a separate execution java class called `Main.java` and call both the methods given above!
