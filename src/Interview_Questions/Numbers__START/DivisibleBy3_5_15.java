package Interview_Questions.Numbers__START;

public class DivisibleBy3_5_15 {

        public static void main(String[] args) {
            //write a code that puts the numbers divisable by 3-5 an 15
            String divisableBY3 ="";
            String divisableBy5 ="";
            String divisableBy15 ="";
            int [] arr = new int[100];
            for(int i=0; i<arr.length; i++){
                arr[i]=i;
            }
            for (int each: arr){
                if (each%15==0&&each%3==0){
                    divisableBy15+=each+" ";
                }
                if (each%5==0&&each%15!=0){
                    divisableBy5+=each+" ";
                }
                if (each%3==0&&each%15!=0){
                    divisableBY3+=each+" ";
                }
            }
            System.out.println(divisableBY3);
            System.out.println(divisableBy5);
            System.out.println(divisableBy15);
        }
    }

