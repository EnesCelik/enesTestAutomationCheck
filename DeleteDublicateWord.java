package Mulakat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDublicateWord {

    public static void main(String[] args) {

        String input = "I am am enes enes";

        String[] inputArr= input.split(" ");

        Set<String> mySet = new LinkedHashSet<String>();

        for(String x:inputArr){
            mySet.add(x);
        }
        Iterator itr= mySet.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+ " ");
            }
    }
}
