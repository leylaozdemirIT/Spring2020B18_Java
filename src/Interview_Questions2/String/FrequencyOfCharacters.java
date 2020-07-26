package Interview_Questions2.String;
/*Write a return method that can find the frequency of characters

        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        FrequencyOfCharacters("AAABBCDD");
    }
    public static void FrequencyOfCharacters(String str){
        String nonDup = "";

        for(int i=0; i<str.length(); i++){
            if(!nonDup.contains("" + str.charAt(i))){
                nonDup += str.charAt(i);
        }
        }
        String expectedResult = "";
        for (int j=0; j<nonDup.length(); j++){
            int count = 0;
            for(int i=0; i<str.length(); i++){
                if(nonDup.charAt(j) == str.charAt(i)){
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        System.out.println(expectedResult);
    }
}
