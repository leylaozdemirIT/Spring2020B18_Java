package day36_StaticBlock;

public class CapitalOne {

    public static void main(String[] args) {

        System.out.println(HumanResources.dev1);
        HumanResources.dev1.setInfo("Ali","SDET",100000,145);
        // you can afterwards change the info if you want
        System.out.println(HumanResources.dev1);
        System.out.println(HumanResources.dev2);
    }


}
