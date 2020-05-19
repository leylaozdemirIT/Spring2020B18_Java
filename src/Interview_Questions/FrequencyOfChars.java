package Interview_Questions;



public class FrequencyOfChars {
    public void main(String[] args) {
        FrequencyOfChars("AAABBCCDDDD");
    }



    public String FrequencyOfChars(String str){

        str = "AAABBCCDDDDD";
        String nonDup = ""; //ABCD
        String result = "";

        for (int i=0; i<str.length(); i++){

            if (! nonDup.contains("" + str.charAt(i))){
                nonDup+=""+str.charAt(i);
            }
        }

        for (int j=0; j<str.length(); j++){
            int count = 0;
            for (int i=0; i<str.length(); i++){
                if ( str.charAt(i) == nonDup.charAt(j) ){
                    count++;
                }
            }
            result += "" + nonDup.charAt(j) + count;
        }

        System.out.println(result);


        return result;
    }
}

