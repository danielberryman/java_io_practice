import java.util.Scanner;

class io1 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("What's your name?");

    String name = s.nextLine();
    System.out.println("Hello " + name + "! It's great to meet you.");
  }
}