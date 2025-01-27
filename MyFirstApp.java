import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class MyFirstApp {
  public static void main(String[] args) {
    LocalDateTime TODAY = LocalDateTime.now();
    System.out.println("Hi, my name is Zoe Wednesday L. Ang.");
    DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = TODAY.format(FORMAT);
    System.out.println(formattedDate);
  }
}