package Mulakat;
/*
import java.awt.*;
import java.awt.List;
import java.util.*;

public class AAAAGenelHashMapListSet {
    public static void main(String[] args) {}
        //HashSet
        Set<String> nameSet = new HashSet<>();
        nameSet.add("a");
        nameSet.add("a");
        nameSet.add("b");
        nameSet.add("c");
        nameSet.add("d");

        System.out.println("Set datas");
        for (String item : nameSet) {
            System.out.println(item);
        }
//HashMap

            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("Ali", 22);
            ageMap.put("Enes", 32);
            ageMap.put("Ahmet", 20);

            for (String name : ageMap.keySet()) {
                if (name.contains("Ali")) {
                    ageMap.put("Ali", 30);
                }
            }
            System.out.println(ageMap);

/////////////////////////////////////

        Map<String, Integer> ageMaps = new HashMap<>();
        ageMaps.put("Ali", 22);
        ageMaps.put("Enes", 32);
        ageMaps.put("Ahmet", 20);

        for (String name : ageMap.keySet()) {
            if (name.contains("Ali")) {
                ageMap.remove(name);
            }
        }
        System.out.println(ageMap);

//HashMap removed
        String input = "programming";

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (Character ch : input.toCharArray()) {
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : input.toCharArray()) {
            if (characterIntegerMap.get(ch) == 1) {
                result.append(ch);
            }
        }

        System.out.println("Original : " + input);
        System.out.println("Removed :" + result);


    //ArrayList
    List<String> names = new ArrayList<>(List.of("Alice", "Veli", "Enes"));

for(
    String name:names)

    {
        System.out.println(name);
    }
names.add("Ahmet");
names.remove("Alice");
System.out.println(names);
    ////////
    List<List<Integer>> nestedList = new ArrayList<>();

nestedList.add(Arrays.asList(1,2,3));
nestedList.add(Arrays.asList(4,5,6));
nestedList.add(Arrays.asList(7,8,9));

    List<Integer> listEx = nestedList.stream()
            .flatMap(List::stream)
            .toList();

System.out.println(listEx);
/////////removed nested list

    List<List<Integer>> nestedList = new ArrayList<>();
    nestedList.add(new ArrayList<>(List.of(1,2,3)));
    nestedList.add(new ArrayList<>(List.of(4,5,6)));
    nestedList.add(new ArrayList<>(List.of(7,8,9)));

    for(
    List<Integer> innerList :nestedList)

    {
        for (int i = 0; i < innerList.size(); i++) {
            if (innerList.get(i) == 5) {
                innerList.remove(i);
                break;
            }
        }
    }

    for(
    List<Integer> innerList :nestedList)

    {
        System.out.println(innerList);
    }
}

///for each lisi
for(List<Integer> innerList:nestedList){
        for(Integer number:new ArrayList<>(innerList)){
        if(number==5){
        innerList.remove(number);
        break;
        }
        }
        }
        }

*/