package OfficeHours.Practice_07_01_2020;

import java.util.LinkedHashMap;
import java.util.Map;
/*
String - apple
a -1
p - 2
l - 3
e - 4
 */
public class Test {
    public static void main(String[] args) {
        countLetters("apples");
    }

    public static void countLetters(String str) {
        // a -> 1
        // p -> 1
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++){

            char key = str.charAt(i);

            if(!map.containsKey(key)){
                map.put(key, 0);
            }
            // updating by 1 -- counting
            map.put(key, map.get(key)+1);
        }
        System.out.println(map);

        for(Character key : map.keySet()){
            System.out.println(key + " = " + map.get(key));
        }
    }
}
