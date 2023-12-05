package Mulakat;

public class ReversEveryWord {

    public static void main(String[] args) {

        String str = "How are you";
        String result = "";

        String[] arr = str.split("\\s");

        for (String word : arr) {

            String reverseWord = "";

            int j = word.length() - 1;
            while (j >= 0) {
                char ch = word.charAt(j);
                reverseWord = reverseWord + ch;
                j--;
            }
            result = result + reverseWord + " ";
        }
        System.out.println(result);
    }

}
