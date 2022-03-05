package Start_number_33;

public class Change_an_Array_Element {
    public static void main(String[] args) {
        /**To change the value of a specific element, refer to the index number
         Instructions:
         - Create an array of string, cars, and assign 5 models: Volvo, BMW, Ford, Mazda, Toyota
         - Using index number change the third car model to: Audi
         - Print changed model using index number*/
        String[] array ={"Volvo","BMW","Ford","Mazda","Toyota"};
        array[2]="Audi";
        System.out.println(array[2]);
    }
}
