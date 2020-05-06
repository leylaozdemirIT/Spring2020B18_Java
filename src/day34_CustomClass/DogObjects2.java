package day34_CustomClass;

public class DogObjects2 {
    public static void main(String[] args) {
        String food1= "chicken";
        String food2 = "fish";

        String drink1 = "water";
        String drink2 = "milk";

        String toy1 = "tennis ball";
        String toy2 = "piano";

        String subject1 = "java";
        String subject2 = "softskill";

        Dog dog1 = new Dog(); // we initialized in below instead of writing one by one
        dog1.setDogInfo("Cocker Spaniel","medium",3,"light brown", "Latte");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Poodle","miniature",2,"White","Lucy");

        dog1.eating(food1);
        dog2.eating(food2);

        dog2.drinking(drink2);
        dog1.drinking(drink1);

        dog1.playing(toy1);
        dog2.playing(toy2);

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","miniature",2,"White","Lucy");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        System.out.println("==========================================");

        Dog [] dogPark = {dog1, dog2, dog3, dog4};

        for (int i=0; i<dogPark.length; i++){
            dogPark[i].eating("Chicken");
        }
        for (Dog eachDog :dogPark){
            eachDog.drinking(drink2);
        }
        for (int i=0; i<dogPark.length; i++){
            dogPark[i].playing(toy1);
        }
        for (Dog each : dogPark){
            each.studying(subject1);
        }
    }

}
