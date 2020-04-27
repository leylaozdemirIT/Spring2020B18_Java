package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main(String[] args) {

        /* Task 08:
        Create a class called salary calculator, write a program that can calculate the tax, and
        salary after tax based on the hourly rate & tax rates

        ex: if rate = 55;
        stateTax = 0.04;
        federalTax =0.22;
        weekly Hours = 40;

        then output will be:
        your salary is: 105600 USD
        your total tax is: 27456 USD
        your income after tax is: 78144 USD

        if:
        rate = 45.25;
        stateTax =0.045;
        federalTax = 0.25;
        weeklyHours = 45;

        then output will be:
        your salary is: 91260 USD
        your total tax is: 26921.7
        your income after tax: 64338.3 USD
        */
        // data type variableName = Data;

        double Hourlyrate = 55;
        double stateTaxrate = 0.04;
        double federalTaxrate = 0.22;
        byte weeklyHours = 40;

        double salaryTotal = Hourlyrate* weeklyHours *52; //gross income (salary before tax)
        double stateTax = salaryTotal * stateTaxrate;
        double federalTax = salaryTotal * federalTaxrate;
        double totalTax = stateTax + federalTax;
        double incomeAfterTax = salaryTotal - (federalTax + stateTax);

        System.out.println("salaryTotal is: $ "+incomeAfterTax);
        System.out.println("your total tax is: $ "+totalTax);
        System.out.println("your income after tax is: $ "+incomeAfterTax);

        System.out.println("========================================================");

        double Hourlyrate2 = 45.25;
        double stateTaxrate2 = 0.045;
        double federalTaxrate2 = 0.25;
        byte weeklyHours2 = 45;

        double salaryTotal2 = Hourlyrate2* weeklyHours2 *52; //gross income (salary before tax)
        double stateTax2 = salaryTotal2 * stateTaxrate2;
        double federalTax2 = salaryTotal2 * federalTaxrate2;
        double totalTax2 = stateTax2 + federalTax2;
        double incomeAfterTax2 = salaryTotal2 - (federalTax + stateTax);

        System.out.println("salary Total is: "+incomeAfterTax2+" USD" + "\nyour total tax is: "+ totalTax2 +" USD"
        + "\nyour income after tax is: " + incomeAfterTax2 + "USD"); }
}
