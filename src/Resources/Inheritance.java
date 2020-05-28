package Resources;

import day42_Inheritance.Data;
/*
        public:accessible at everywhere, visible to the world
        protected:visible in same package,visible in sub class outside package
                protected is always visible to any subclass
        default: only visible in the same package
        private: only visible within the same class
    */
public class Inheritance extends Data {

    public static void main(String[] args) {
        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
    //  System.out.println(Inheritance.defaultData);
    //  System.out.println(Inheritance.privateData);

    }

}
