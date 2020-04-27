package day07_IfStatements;

public class valid_Triangle {

    public static void main(String[] args) {

    byte angle1 = 50;
    byte angle2 = 50;
    byte angle3 = 30;
    int sumOfAngles = angle1 + angle2 + angle3;

    boolean validTriangle = sumOfAngles == 180;

    if (validTriangle) {
            System.out.println("The shape is a triangle");
        }

        if (!validTriangle) {
            System.out.println("The shape is not a valid triangle");
        }
     // option 2:
        if (sumOfAngles == 180){
            System.out.println("This is a triangle");
        }
        if (sumOfAngles != 180){
            System.out.println("This is NOT a triangle");
        }
    }
    }






