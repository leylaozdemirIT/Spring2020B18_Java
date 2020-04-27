package day08_IfStatements;

public class daysInMonth_MultiBranchIf {
    public static void main(String[] args) {
        byte numberOfMonths = 3;

        String result = " ";
        int days = 0;

        if (numberOfMonths == 1){
            days = 31;
        result = "January has " + days + " days";
    }    else if (numberOfMonths == 2){
    result = "February has 28 or 29 days";
        } else if (numberOfMonths == 3){
            days = 31;
            result = "March has " + days + " days";
    }
    else if (numberOfMonths == 4){
        result = "April has 30 days";
    }
    else if (numberOfMonths == 5){
        result = "May has 31 days";
    }
    else if (numberOfMonths == 6){
        result = "June has 30 days";
    }
    else if (numberOfMonths == 7){
        result = "July has 31 days";
    }
    else if (numberOfMonths == 8){
        result = "August has 30 days";
    }
    else if (numberOfMonths == 9){
        result = "September has 31 days";
    }
    else if (numberOfMonths == 10){
        result = "October has 30 days";
    }
    else if (numberOfMonths == 11){
     result = "November has 31 days";
    }
        else if (numberOfMonths == 12){
        result = "December has 30 days";
    }
        else {
            result = "Invalid entry";
        }
        System.out.println(result);
}}

