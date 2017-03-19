import java.util.Scanner;
public class PigLatin {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Hello, please enter some text:");
    String input = scanner.nextLine();
    System.out.println("You entered:" + input);
    
    String piglatinstr = new String("");

    for(int i = 0; i < str.length(); i++) {

      char myChar = str.charAt(i);

      if(myChar == ' '|| i == 0) {

        String firstLetter = new String("");

        if(i == 0) {
          firstLetter = firstLetter.concat(Character.toString(str.charAt(i)));
          System.out.print(firstLetter);
        } else {
          firstLetter = firstLetter.concat(Character.toString(str.charAt(i + 1)));
          System.out.print(firstLetter);
        }

        piglatinstr = piglatinstr + firstLetter;
        // System.out.println(firstLetter);
      } else {
        String letter = Character.toString(str.charAt(i));
        piglatinstr.concat(letter);
      }
      // System.out.println(piglatinstr);
    }
  }
}
