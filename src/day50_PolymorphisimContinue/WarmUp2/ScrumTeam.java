package day50_PolymorphisimContinue.WarmUp2;

import day45_Exceptions.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class ScrumTeam extends Employee{
    public static void main(String[] args) {
        Employee emp1 = new Developer();
        Employee emp2 = new Developer();
        Employee emp3 = new Developer();

        Employee emp4 = new Tester();
        Employee emp5 = new Tester();

        ArrayList<Employee>ScrumTeam = new ArrayList<>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));

    }
}
