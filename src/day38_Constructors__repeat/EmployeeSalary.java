package day38_Constructors__repeat;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator zareen = new SalaryCalculator(50, 40, 5.75/100, 0.2);

        System.out.println(zareen);

        System.out.println("============================");

        SalaryCalculator Namık = new SalaryCalculator(62,40,8.75/100,0.26);

        System.out.println(Namık);
    }
}
