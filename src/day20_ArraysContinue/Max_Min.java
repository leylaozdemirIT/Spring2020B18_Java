package day20_ArraysContinue;

/*write a program that can find the maximum number from any given int array
        NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE CLASS
  write a program that can find the minimum number from any given int array
         */
public class Max_Min {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int lastindex = arr.length-1;
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i<=lastindex; i++){

            if (arr[i] > max){ //array's index are compared with each other,which is greater-will be assigned to max value
            max = arr[i];
        }
            if (arr[i] < min){
                min = arr[i]; //array's index are compared with each other,which is smaller-will be assigned to min value
            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}
