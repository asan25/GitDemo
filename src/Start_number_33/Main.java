package Start_number_33;

class Main {
    public static void main(String[] args) {
        System.out.println(makeThreeSubstr("hello", 0, 2)); //should be hehehe
        System.out.println(makeThreeSubstr("shenanigans", 3, 7)); //should be naninaninani
    }

    public static String makeThreeSubstr(String word, int a, int b) {
        String word1 = "";
        for (int i = 1; i <= 3; i++) {
            word1 += word.substring(a, b);
        }
        return word1;
    }
}