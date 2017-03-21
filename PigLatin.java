import java.util.Scanner;
public class PigLatin {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    final String vowels = "aeiouAEIOU";
    System.out.println("Hello, please enter a word to convert to Pig Latin");
    String input = scanner.nextLine();
    System.out.println("You entered: " + input);

    String piglatinstr = new String("");
    String firstLetter = new String("");

    for(int i = 0; i < input.length(); i++) {
      if(i == 0) {
        firstLetter = firstLetter.concat(Character.toString(input.charAt(i)));
      } else {
        String letter = Character.toString(input.charAt(i));
        piglatinstr = piglatinstr.concat(letter);
      }

    }



    System.out.println(piglatinstr);
  }
}
