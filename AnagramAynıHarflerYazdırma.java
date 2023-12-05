package Mulakat;

import java.util.Arrays;
import java.util.Locale;

public class AnagramAynıHarflerYazdırma {
    public static void main(String[] args) {

        String str= "army";
        String str1= "maryasdasdasda";

char[] arr1 = str.toLowerCase().toCharArray();
char[] arr2 = str1.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
 if(Arrays.equals(arr1,arr2)){
     System.out.println("Anagram");
 }       else
     System.out.println("not anagram");


}
}
