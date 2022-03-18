# Stream Practice Questions

## Task 12

Create a java class file called `Laptop.java`. The `Laptop.java` class should contain the following members:

1. a private field to store the name of the laptop, as a reference `String` type value. **IMMUTABLE**
2. a private field to store the graphic cards' capacity in GBs, as a primitive `byte` type value.
3. a private field to store the ram capacity in GBs, as a primitive `byte` type value.
4. a private field to store the price of the laptop in INR, as a primitive `double` type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.

Create a java class file called `LaptopComparison.java`. The class should contain the following two methods:

* ```java
  public Set<Laptop> getGamingLaptops(List<Laptop> laptops, byte ramCapacity, byte graphicsCardCapacity) {}
  ```
  This method will return all the laptops which have a ram capacity of at least (or more) as specified in the argument,
  AND a graphics card capacity (or more) as specified in the argument. The returning set from the method should be
  sorted in a decreasing order of their price, if price is same use RAM, is RAM is same, use graphics.
* ```java
  public Set<Laptop> sortGamingLaptops(Set<Laptop> laptops) {}
  ```
  This method will sort the gaming laptops for the `getGamingLaptops()` method. The set of the laptops should be sorted
  in a decreasing order of their price.

Create a separate execution java class called `Main.java` and call both the methods given above!
