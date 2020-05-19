package day39_AccessModifiers;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Rustem");

        System.out.println(employee1);

        Employee employee2 = new Employee("Leyla","SDET");

        System.out.println(employee2);

        Employee employee3 = new Employee("Leyla","SDET",123);

        System.out.println(employee3);

        Employee employee4 = new Employee("Leyla","SDET",123,120000);

        System.out.println(employee4);
    }
}
