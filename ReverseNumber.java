package Mulakat;

public class ReverseNumber {

    public static void main(String[] args) {

        int number= 1234;

        System.out.println(reverseNumber(number));

    }

    public static int reverseNumber(int num) {

        int result = 0;
        while (num>0){
            result=result*10+num%10;
            num=num/10;
        }


        return result;
    }
}
