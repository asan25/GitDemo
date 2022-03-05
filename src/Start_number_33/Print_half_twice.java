package Start_number_33;

import java.util.Scanner;

public class Print_half_twice {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         Write a program that will print out first half of the word twice.
         Example for even number words
         input: java
         output: jaja
         Example for odd number words
         input: black
         output: blbl */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()%2==0){
            System.out.print(word.substring(0,2));
            System.out.println(word.substring(0,2));
        }
        else{
            System.out.println("You entered odd number word");
        }
    }

}
