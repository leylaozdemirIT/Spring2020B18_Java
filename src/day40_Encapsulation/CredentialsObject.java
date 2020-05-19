package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        facebook.setUserName("A.paulura");
        facebook.setPassWord("123456");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());
    }
}
