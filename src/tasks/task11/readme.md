# Stream Practice Questions

## Task 11

Create a java class file called `Laptop.java`. The `Laptop.java` class should contain the following members:

1. a private field to store the name of the laptop, as a reference `String` type value. **IMMUTABLE**
2. a private field to store the ram of the laptop in GBs, as a primitive `byte` type value.
3. a private field to store the price of the laptop in INR, as a primitive `double` type value.
4. a private field to indicate the availability of the laptop, as a primitive `boolean` type value. **IMMUTABLE**
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the equals(),
   toString() and the hashCode() methods.

Create a java class file called `LaptopBuyerHelper.java`. The class should contain the following two methods:

* ```java
  public List<Laptop> getLaptopList(List<Laptop> laptops, byte ramCapacity) {}
  ```
  This method will return all the laptop objects whose ram capacity is at least (or more) than the ram capacity
  specified in the parameters. A laptop should only be returned from the method if it is available in stock. If no such
  laptop is available, the method should not return `null`. The method should also not return duplicates.
* ```java
  public Set<Laptop> findLaptop(List<Laptop> laptops, byte ramCapacity, double price) {}
  ```
  This method will return all the laptop objects whose price is at most (or lower) than the price specified in the
  parameters, if showing a laptop with a different price, make sure the ram should be the same. If no such laptop is
  available, the method should not return `null`. The method should also not return duplicates.

Create a separate execution java class called `Main.java` and call both the methods given above!
