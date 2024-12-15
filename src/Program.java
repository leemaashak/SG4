import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        System.out.println(countWords("t est   a   is    This wow   omg"));
        System.out.println(reverseWords("this   is   a  test"));
    }

    public static int countWords(String s) {
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) != ' ') {
                wordCount++;
            }
            if (s.charAt(i) == ' ' && i + 1 < s.length() && s.charAt(i + 1) != ' ') {
                wordCount++;

            }

        }

        return wordCount;
    }

    public static String reverseWords(String s) {
        String str = "";
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            if(words[i]!=""){
                str = str + words[i] + ' ';
            }

        }

        return str;
    }


}
