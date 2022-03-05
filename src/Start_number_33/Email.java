package Start_number_33;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         In this task, you need to swap first name with last name in the email. If email doesn't contain underscore - don't change anything
         Example:
         input: mike_tyson@gmail.com
         output: tyson_mike@gmail.com
         Example:
         input: barakobama@gmail.com
         output: barakobama@gmail.com*/
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String newEmail="";
        if(email.contains("_")){
            String firstWord=email.substring(0,email.indexOf('_'));
            String secondWord=email.substring(email.indexOf('_')+1,email.indexOf('@'));
            newEmail=secondWord+"_"+firstWord+email.substring(email.indexOf('@'),email.length());
            System.out.println(newEmail);
        }
        else{
            System.out.println(email);
        }
    }
}
