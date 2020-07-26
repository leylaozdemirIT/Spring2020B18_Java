package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_Practice1 {
    public static void main(String[] args) {
        Map<String, LocalDate> classmates = new LinkedHashMap<>();

        classmates.put("Taha",LocalDate.of(1998,7,16));
        classmates.put("Anil",LocalDate.of(1453,1,1));
        classmates.put("Saban",LocalDate.of(1900,01,30));
        classmates.put("Anna",LocalDate.of(1990,2,28));
        classmates.put("Namik",LocalDate.of(1453,01,01));
        classmates.put("Yucel",LocalDate.of(1990,12,28));
        classmates.put("Namik",LocalDate.of(1990,4,5));

        classmates.put("Anil",LocalDate.now());

        System.out.println(classmates);

        classmates.remove("Anil");
        System.out.println(classmates);

        System.out.println(classmates.get("Namik"));

        boolean r1 = classmates.containsKey("Anna");
        System.out.println(r1);

        boolean r2 = classmates.containsValue(LocalDate.of(1990,4,5));
        System.out.println(r2);

        boolean r3 = classmates.isEmpty();
        System.out.println(r3);

        classmates.clear();
        System.out.println(classmates);

        System.out.println("=================================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

     for ( String eachKey : students.keySet()){
            int eachValue = students.get(eachKey); // score
            if (eachValue < 90){
                badStudents.put(eachKey, eachValue);
            }else{
                goodStudents.put(eachKey,eachValue);
            }
        }
        System.out.println(badStudents);
        System.out.println(goodStudents);

    }
}
