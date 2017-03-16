public class ReverseString {
  public static void main(String args[]) {

    String str = new String("My String");
    String reverseStr = new String("");

    for(int i = str.length() - 1; i >= 0; i --) {
      String letter = Character.toString(str.charAt(i));
      reverseStr = reverseStr.concat(letter);
    }
    System.out.println(reverseStr);

  }
}
