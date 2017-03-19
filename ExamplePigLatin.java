import java.util.Scanner;
public class ExamplePigLatin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String vowels = "aeiouAEIOU";
        System.out.println("Enter your word.");
        String word = sc.nextLine();
        while (!word.equalsIgnoreCase("done"))
        {
            String beforVowel = "";
            int cut = 0;
            while (cut < word.length() && !vowels.contains("" + word.charAt(cut)))
            {
                beforVowel += word.charAt(cut);
                cut++;
            }
            if (cut == 0)
            {
                cut = 1;
                word += word.charAt(0) + "w";
            }
            System.out.println(word.substring(cut) + beforVowel + "ay");
            System.out.println("Enter your word.");
            word = sc.nextLine();
        }
    }
}


// delimiter is a sequence of one or more characters used to specify the boundary between separate, independent regions
// which can be in plain text or other data streams.
// An example of a delimiter is the comma character,
 // it acts as a field delimiter in a sequence of comma-separated values.
