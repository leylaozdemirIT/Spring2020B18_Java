package day50_PolymorphisimContinue;

public class Encapsulation {

    private String username = "Cybertek";
    // if data is final, we can not generate setter. We can only generate getter

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
}

class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        //System.out.println( obj.username );
        System.out.println(obj.getUsername());

        //obj.username = "Cybertek";
        obj.setUsername("Cybertek");
    }
}