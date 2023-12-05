package Mulakat;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr={5,156,-234,23,1,2,3,45,9};

        int min= arr[0];
        int max= arr[0];

        for(int i=0; i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("min is: "+ min);
        System.out.println("max is: "+ max);
    }
}
