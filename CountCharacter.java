package Mulakat;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "Java is my main language";

        int result = str.length() - str.replaceAll("a", "").length();
        System.out.println(result);
    }
}
