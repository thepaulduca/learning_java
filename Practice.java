public class Practice {
  public static void main (String[] args){
    String str = "MyString";
    String[] strArry = str.split("(?!^)");
    for(int i = 0; i < str.length(); i ++){
      System.out.println(strArry[i]);
    }
  }
}
