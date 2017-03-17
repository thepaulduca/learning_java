public class PigLatin {
  public static void main(String[] args) {

    String str = new String("Turn this sentance into pig Latin");
    String piglatinstr = new String("");

    for(int i = 0; i < str.length(); i++) {
      char myChar = str.charAt(i);
      if(myChar == ' '|| i == 0) {
        if(i == 0) {
          String firstletter = Character.toString(str.charAt(i));
        } else {
          String firstLetter = Character.toString(str.charAt(i + 1));
        }
        System.out.println(firstLetter);
      }
      // System.out.println(myChar);//
    }
  }
}
