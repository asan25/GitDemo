package Start_number_33;

import java.util.Scanner;

public class String_methods_practice_064 {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         You have a word, do the following:
         When word has odd number of characters and:
         **- 3 or more characters,** print middle letter
         oak ==> a
         javav ==> v
         - **Single character,** print that character 3 times
         # ==> ###
         q ==> qqq
         When word has even number of characters and:
         - **4 or more characters**, print middle 2
         java ==> av
         apples ==> pl
         #$%^&* ==> %^
         2 characters, print those 2 characters twice
         @@ ==>@@@@
         $$ ==>$$$$
         hi ==> hihi*/
        Scanner scan  = new Scanner(System.in);
        String word = scan.next();
        if(word.length()>=3&&word.length()%2!=0){
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        }
        else if(word.length()>=4&&word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }
        else if(word.length()==1){
            for(int i=0;i<3;i++){
                System.out.print(word);
            }
        }
        else if(word.length()==2){
            for(int i=1; i<3;i++){
                System.out.print(word);
            }
        }
    }
}
