# Stream Practice Questions

## Task 4

Create a java class file called `YouTubeVideo.java`. The `YoutubeVideo.java` class should contain the following members:

1. a private field to store the video id of the video, as a primitive `long` type value. **This should be immutable!**
2. a private field to store the name of the video, as a reference `String` type value. **This should be immutable!**
3. a private field to store the number of likes, as a reference `BigInteger` type value.
4. a private field to store the duration of video in minutes, as a primitive `int` type value.
5. the necessary getter/setter methods for the private fields, at least two constructors for this class, the `equals()`,
   `toString()` and the `hashCode()` methods.

   Create a java class file called VideoAnalytics.java. The class should contain the following two methods:

* ```java
   public HashSet<YouTubeVideo> getTopTenViralVideos(List<YouTubeVideo> videos) {} 
   ```
  This method inputs a list of `YouTubeVideo` type and returns a hash set of `YouTubeVideo` type. This method will
  iterate through the list of videos it has received, and it should find out the top 10 videos with the most-number of
  likes, then store those videos in a `HashSet` and return it. If two videos have the same number of likes, use
  duration.

* ```java
   public List<String> showDetailsOfShortVideos(Set<YouTubeVideo> videos) {} 
   ```
  This method inputs a set of `YouTubeVideo` type and returns a list of `String type`. A short video is one whose
  duration is less than or equal to 10 minutes. Find all such videos and store the name, number of likes and duration of
  the video into a String, and store all such strings into a list and return it from the method.

   ```
   ex ["Java for Beginners - 10000 - 10", ...]
   ```

  Create a separate execution java class called `Main.java` and call both the methods given above!
