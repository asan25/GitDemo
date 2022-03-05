package Start_number_33;

import java.util.Scanner;

public class CItizens_33 {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         Note: prerequisite - if-else statement
         -Declare int variables: seniorCitizens, nonSeniorCitizens, age
         -Create a Scanner object
         Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
         "Enter current count for seniorCitizens and nonSeniorCitizens:"
         -Ask user to enter age:
         "What is new citizen's age?"
         -if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.
         -if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.
         -At last, print another message:
         "New seniorCitizens count ValueOfVariable"
         "New nonSeniorCitizens count ValueOfVariable"
         Example Run:
         Enter current count for seniorCitizens and nonSeniorCitizens:
         5
         4
         What is new citizen's age?
         66
         Senior Citizen
         New seniorCitizens count 6
         New nonSeniorCitizens count 4*/
        Scanner scan = new Scanner(System.in);
        int seniorCitizens, nonSeniorCitizens, age;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens=scan.nextInt();
        nonSeniorCitizens= scan.nextInt();
        System.out.println("What is new citizen's age?");
        age=scan.nextInt();
        System.out.println(age);
        if(age>=65){
            System.out.println("Senior Citizen");
            seniorCitizens+=1;
        }
        else{
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens+=1;
        }
        System.out.println("New seniorCitizens count "+seniorCitizens);
        System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
    }
}
