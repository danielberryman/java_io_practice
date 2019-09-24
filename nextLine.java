import java.util.Scanner;

class nextLine {
  public static void main (String[] args) {
    String s = "First line\n 2nd line \n final line"; 
  
    // create a new scanner 
    // with the specified String Object 
    Scanner scanner = new Scanner(s); 

    // print the first line
    System.out.println(scanner.nextLine()); 

    // print the next line  
    System.out.println(scanner.nextLine()); 

    // print the next line  
    System.out.println(scanner.nextLine()); 

    scanner.close(); 
  }
}