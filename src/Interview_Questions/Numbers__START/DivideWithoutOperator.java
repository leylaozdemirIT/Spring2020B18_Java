package Interview_Questions.Numbers__START;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        divides(10,3);
    }

    public static void divides(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid Number");

            return;

        }

        System.out.print(num1 +" devid by "+num2 +" is: ");

        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println(count+" and remainder is "+num1);

    }
}
