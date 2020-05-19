package day39_AccessModifiers;

public class Test {

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.defaultAccess);
        System.out.println(obj.publicAccess); // always accessible because is public

        // System.out.println(obj.SSN); - private:only accessible in the class
    }


}
