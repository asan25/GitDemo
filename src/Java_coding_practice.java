import java.util.Scanner;

public class Java_coding_practice {
    public static void main(String[] args) {
        /**Write a program that prints out the numbers from 1 to 30 but for numbers which are a multiple
         of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA"
         instead of the number. For numbers which are a multiple of both 3 and 5,print "FINRA" instead
         of the number.*/
        /*for(int i=1;i<=30;i++){
            if(i%3==0){
                System.out.println("FIN");
            }
            else if(i%5==0){
                System.out.println("RA");
            }
            else if(i%15==0){
                System.out.println("FINRA");
            }
            else{
                System.out.println(i);
            }
        }*/

        /**Write a program that will count how many times “java” is found in any given String:*/
        /*Scanner scan =  new Scanner(System.in);
        String sentence = scan.nextLine();
        sentence=sentence.toLowerCase();
        String[]array = sentence.split(" ");
        String word ="java";
        int count =0;
        for(int i=0;i<array.length;i++){
            if(array[i].contains(word)){
                count++;
            }
              else {
                  continue;
            }
        }
        System.out.println(count);*/

/**Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if
 it is not:*/

       /* Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverseWord = "";
        for(int i=word.length()-1;i>=0;i--){
            reverseWord+=word.charAt(i);
        }
        System.out.println(reverseWord.equals(word));*/


    /**Given any String print out how many times each character is found in the String*/
    /*String word = "baku";
    char[] array =word.toCharArray();
    String word2 = "";
    for(int i=0;i<array.length;i++){
        int count = 0;
        if(word2.contains(array[i]+""))
            continue;
        for(int k=0;k<array.length;k++){
            if(array[i]==array[k]){
                count++;
            }
            else {
                word2+=array[i];
                continue;
            }
        }
        System.out.println(array[i]+""+count);
    }*/

      /**Create a program that will take any String and print the total sum of all the numbers in the
       String. Note: numbers can be more than digits from 1-9 so if you have “14” next to each other it
       should be considered 14 and not 1 and 4 separate:*/

//            String sentence = "i2 love25you6 22seni";
//           sentence=sentence.replace(" ","a");
//            int sum=0;
//            String digits = "123456789";
//            for (int i=0;i<sentence.length();i++){
//            if(!digits.contains(sentence.charAt(i)+"")){
//              sentence=sentence.replace(sentence.charAt(i),'0');
//            }
//            else {
//                continue;
//            }
//            }
//
//        for(int i=0;i<sentence.length();i++){
//            sentence=sentence.replaceFirst("0","");
//           if(digits.contains(sentence.charAt(i)+"")){
//               int number =Integer.parseInt(sentence);
//               sum+=number;
//           }
//           else {
//               continue;
//           }
//        }
//        System.out.println(sentence);
        String str = "jav45ai15sgre1at82" ;
        int sum = 0 ;
        String num = "" ;
        for ( int i = 0 ; i <str.length() ; i++) {
            if (str.charAt(i)>= '0' && str.charAt(i)<= '9' ){
                num += str.charAt(i);

                if (i==str.length()- 1 || !(str.charAt(i+ 1 )>= '0' && str.charAt(i+ 1 )<= '9' )){
                    sum += Integer. parseInt (num);
                    num= "" ; } } }
        System. out .println(sum);
    }
}
