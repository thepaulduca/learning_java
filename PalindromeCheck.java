import java.util.Scanner;
public class PalindromeCheck {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a word to check if it is a Palindrome");
    String input = sc.nextLine();

    String[] ary = input.split("(?!^)");
    boolean palin = false;

    for(int i = 0; i < input.length(); i ++){
      if(ary[i].equals(ary[input.length() - i - 1])) {
        palin = true;
      } else {
        palin = false;
        break;
      }
    }

    if(palin){
      System.out.println(input + " is a Palindrome!");
    } else {
      System.out.println(input + " is not a Palindrome.");
    }
  }
}
