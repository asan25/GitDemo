package Start_number_33;

public class Min_num_array {
    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(minValue(arr)); //should print -3
    }
    public static int minValue(int[] num) {
       int min=num[0];
        for(int i=0;i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        return min;
    }
}
