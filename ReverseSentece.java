package Mulakat;

public class ReverseSentece {
    public static void main(String[] args) {

        String str = "We are learning Java";
        String result ="";
        String[] arr = str.split("\\s");

        for(int i= arr.length - 1; i >= 0 ; i-- ){
            result = result + arr[i]+" ";
        }
        System.out.println(result);
    }
}
