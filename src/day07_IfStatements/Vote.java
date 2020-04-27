package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {

    byte age =15;
    boolean citizen = true;
    boolean likeDonald = true;

    boolean eligibleToVote = (age >= 18) && (citizen == true);

        if (eligibleToVote == true) {
        System.out.println("You are eligible to vote for Donald Trump");
    }
        if (eligibleToVote != true) {
        System.out.println("You are NOT eligible to vote for Donald Trump");
    }
}}