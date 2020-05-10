package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Quiz {
    /*
 write a program that can remove all the special characters from a list of Character
 write a program that can remove all the numbers that can be divisible by 3 or 5 in Array list
     */
    public static void main(String[] args) {
        Predicate<Integer> divisibleBy3Or5 = n-> n%3==0 || n%5 ==0;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList( 11,12,13,14,15,16,17));
        numbers.removeIf(divisibleBy3Or5);
        System.out.println(numbers);

        System.out.println("============================");
        Predicate<Character> specialCharacters = c -> (c>=32 && c<=47) || (c>=58 && c<=64)
                || (c>=91 && c<=96) || (c>=123 && c<=126);
//32–47 / 58–64 / 91–96 / 123–126
        ArrayList<Character> characters = new ArrayList<>();
        characters.addAll( Arrays.asList ('@', '#', 'B'));
        characters.removeIf( specialCharacters);
        System.out.println(characters);

        //5, 9, 10 11

        //5
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Robb", "Bran", "Rick", "Bran"));
        //  0        1       2       3

        if( names.remove("Bran") ){    // {Robb", "Rick", "Bran"};
            names.remove("John");  //{Robb", "Rick", "Bran"};
        }

        System.out.println(names);

        //9
        ArrayList<Integer> numbers1 = new ArrayList<>( Arrays.asList(1,2,3,4,5));  // { 1, 2, 3, 4, 5}

        // { 1, 2, 3, 4, 5}

        numbers1.set(0,  numbers1.get(4) );  //{5, 2, 3, 4, 5}
        // set(0, 5)

        //{5, 2, 3, 4, 5}
        numbers1.set(4, numbers1.get(0)) ; // {5, 2, 3, 4, 5}
        // set(4, 5)

        System.out.println(numbers1);

        System.out.println("=========================");
        // 11
        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7));
        //{1,2,3,4,5,6,7}

        for(Integer each: nums){ // each: 1,2,3,4,5,6,7
            if(each % 2 != 0){
                continue;
            }

            System.out.print(each+" "); // 2
            break;

        }



    }


}




