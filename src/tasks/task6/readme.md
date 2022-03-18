Task 6 Create a java class file called SmartPhone.java. The SmartPhone.java class should contain the following members:

1. a private field to store the IMEI number of the smartphone, as a reference Long type value. IMMUTABLE
2. a private field to store the name of the smartphone, as a reference String type value. IMMUTABLE
3. a private field to store the price of the smartphone, as a primitive double type value.
4. a private field to store the screen size of the smartphone
   (in inches), as a primitive byte type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the equals(),
   toString() and the hashCode() methods. Create a java class file called OnlineShop.java. The class should contain the
   following two methods:
1. public List<SmartPhone> getListOfSmartPhones
   (Set<SmartPhone> smartPhones, byte requiredScreenSize) {} This method inputs a Set of SmartPhone type and a required
   screen size value of byte type. This method will iterate through all the smart phone objects' set and find out the
   smart phones whose screen size is at least as large as the required screen size value. If you find a phone whose
   screen size is lesser, decrease its price by 10%
2. public List<SmartPhone> findBudgetSmartPhones(Set<SmartPhone>
   smartPhones) {} This method inputs a Set of SmartPhone type and returns a List of SmartPhone type. A budget smart
   phone is a phone whose price is less than or equal to 10,000 INR. If you do not find any such phone in the set of
   smart phones, make sure that your method does not return null!
   Create a separate execution java class called Main.java and call both the methods given above!
