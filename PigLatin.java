import java.util.Scanner;
public class PigLatin {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    final String vowels = "aeiouAEIOU";

    System.out.println("Hello, please enter a word to convert to Pig Latin");
    String input = scanner.nextLine();
    System.out.println("You entered: " + input);

    while(!input.equalsIgnoreCase("done")) {
      String beforeVowel = "";
      int cut = 0;
      while(cut < input.length() && !vowels.contains("" + input.charAt(cut))) {
        beforeVowel += input.charAt(cut);
        cut ++;
      }
        if(cut == 0){
          cut = 1;
          input += input.charAt(0) + "w";
        }
        System.out.println(input.substring(cut) + beforeVowel + "ay");
        System.out.println("Enter another word or enter done to end program");
        input = scanner.nextLine();
    }
  }
}
