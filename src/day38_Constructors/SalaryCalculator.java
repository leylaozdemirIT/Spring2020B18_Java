package day38_Constructors;
/*
instance variables:
hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
add a constructor can initialize those fields
instance methods:
salary(): returns the total salary as double
salaryAftertax(): retuns the salary after tax as double
stateTax(): retuns the total state tax as double
federalTax(): retuns the total federal tax as double
toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
*/
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double fedralTaxRate;

    public SalaryCalculator(double hourlyRate,int weeklyHours,double stateTaxRate,double fedralTaxRate){
this.hourlyRate = hourlyRate;
this.weeklyHours = weeklyHours;
this.stateTaxRate = stateTaxRate;
this.fedralTaxRate = fedralTaxRate;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 48;
    }
    public double salaryAfterTax(){
        return salary()-( stateTax()+federalTax());
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*fedralTaxRate;
    }
    public String toString(){
        return "Hourly Rate: $ "+hourlyRate + "\nWeekly Hours: "+weeklyHours+
                "Salary: $" + salary() + "\nState Tax $" + stateTax() + "\nFederal Tax: $"+ federalTax()+
                "\nSalary after Tax: $"+salaryAfterTax();
    }
}
