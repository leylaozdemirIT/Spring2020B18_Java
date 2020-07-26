package Interview_Questions.Numbers__START;

public class Fibonacci_numbers__DO {
    public static void main(String[] args) {
        System.out.println(FibNumbers(9));
    }

    public static int FibNumbers(int num) {
        int result = 0; //stores the result
        int j = 0;//first number
        int z = 1;//second number
        for (int i = 1; i < num; i++) {// for loop that is needed to loop through the sequence
            result = j + z;//result == first num + second number
            j = z;//we need to move forward so we replace the first number with the second number
            z = result;// we need to move forward so we replace the second number with the 3rd new number
        }
        return result;// printing the result of the num int we have to return in the main method so we get the sequence of the number
    }
}// 0 1 1 2 3 5 8 13 21 34 45