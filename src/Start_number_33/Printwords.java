package Start_number_33;

import java.util.Scanner;

public class Printwords {
    public static void main(String[] args) {
       /**Instructions from your teacher:
        You have 2 words, both of them have 3 characters.
        If either of them does not have exactly 3 characters, print "cannot merge"
        Merge their characters one by one and print together like below:

        input 1: aok
        input 2: lol
        output:  alookl

        input 1: ear
        input 2: pie
        output:  epaire

        input 1: java
        input 2: wow
        output:  cannot merge

        hint:
        by inserting +""+ (empty string) between chars, you can concatenate char values.*/
       Scanner scan = new Scanner(System.in);
       String word1 = scan.next();
       String word2 = scan.next();
       String[] a =word1.split("");
       String[] b =word2.split("");
       if(word1.length()==word2.length()){
           String word = "";
           for(int i=0;i<3;i++){
               word+=a[i]+b[i];
           }
           System.out.println(word);
       }
       else{
           System.out.println("cannot merge");
       }

    }
}
