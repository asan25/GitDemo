package Start_number_33;

import java.util.Scanner;

public class Middle_tree {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         You have a word, do the following:
         If the word has odd number of characters
         and has 5 or more characters, print the middle three
         characters of the word.
         Otherwise print "invalid".
         fifteen ==> fte
         apple ==> ppl
         hey ==> invalid
         java ==> invalid
         whatsup ==> ats
         $ ==> invalid*/
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()%2!=0&&word.length()>=5){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }
        else{
            System.out.println("invalid");
        }
    }
}
