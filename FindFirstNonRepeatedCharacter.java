package Mulakat;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "swiss";

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        int count = 1;

        for(int i= 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), count);
            }else
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }

        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("Non repeated char: " + entry.getKey());
                break;
            }
        }
}
}
