package Mulakat;

import java.util.*;

public class FindDuplicatesArraySayı {
    public static void main(String[] args) {

        int[] inputArr = {2, 5, 6, 7, 9, 2, 8, 7, 11, 11};

        // FindDuplicatesArraySayı.findDublicate(inputArr);
        //  FindDuplicatesArraySayı.dubliceSorting(inputArr);
        // FindDuplicatesArraySayı.dublicateHashSet(inputArr);
        FindDuplicatesArraySayı.dublicateHashMap(inputArr);
    }

    //BruteForce
    private static void findDublicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Dublicate number is :" + arr[i]);
                }
            }
        }
    }

    //find duplicates in array in java using sorting

    private static void dubliceSorting(int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                System.out.println("Dubliceted number is : " + arr[i]);
        }
    }

    //find duplicates in array in java using HashSet

    private static void dublicateHashSet(int[] arr) {
        Set<Integer> hs = new HashSet<>();

        for (int x : arr) {
            if (!hs.add(x)) {
                System.out.println("The dublicated number is : " + x);
            }
        }
    }

    //find duplicates in array in java using HashMap

    private static void dublicateHashMap(int[] arr) {
        Map<Integer,Integer> hm= new HashMap<Integer,Integer>();

        for(int x: arr){
            if(!hm.containsKey(x)){
                hm.put(x,1);
            }else
                hm.put(x,hm.get(x)+1);
        }
        for(Integer x : hm.keySet()){
            if(hm.get(x)>1)
                System.out.println("The dublicated element is : "+ x);
        }

    }
}
