package Start_number_33;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         In this exercise you get a string called txt .
         output txt without its last letter.
         for example:
         txt = "foo"
         output will be:
         fo*/
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.substring(0,word.length()-1));
    }
}
