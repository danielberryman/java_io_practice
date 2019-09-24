import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Silence {
  public static void main (String[] args) {

    File file = new File("./file.txt");

    try {
      
      Scanner s = new Scanner(file);

      // read the file
      while(s.hasNextLine()) {
        System.out.println(s.nextLine());
      }

      s.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}