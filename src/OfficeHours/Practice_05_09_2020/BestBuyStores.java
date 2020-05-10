package OfficeHours.Practice_05_09_2020;

import OfficeHours.Practice_05_09_2020.BestBuy;

public class BestBuyStores {

    public static void main(String[] args) {

        BestBuy store1 = new BestBuy();
        store1.location = "Gaithersburg";
        store1.numberOfEmployees = 30;
        store1.phoneNumber = "3019485060";
        store1.numberOfComputers=10;
        store1.numberOfComputers--;

        System.out.println(BestBuy.numberOfComputers);

        store1.close();

        BestBuy.closeAll();






    }
}
