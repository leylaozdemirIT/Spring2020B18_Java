package Resources;

import day39_AccessModifiers.AccessModifiers;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        //System.out.println(obj.defaultAccess); - you can not get access to default modifier outside package
        System.out.println(obj.publicAccess);

    }
}
