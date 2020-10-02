package lab_6;

import lab_5.BussinesCard;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        BussinesCardWithCity card1 = new BussinesCardWithCity("maciek" , "lol" , "12312312" , "Warszawa");
        BussinesCardWithCity card2 = new BussinesCardWithCity("maciek" , "lol" , "12312312" , "Kraków");
        BankCard card3 = new BankCard("lol" , "bolo" , "123" ,"123123123");


        Wallet wallet = new Wallet();

        wallet.add(card1);
        wallet.add(card2);
        wallet.add(card3);
        //System.out.println(wallet);

        ArrayList<BussinesCard> cardbyCities = wallet.getByCity("Warszawa");

        for (BussinesCard card:
             cardbyCities) {
            System.out.println(card);
        }

        System.out.println();
        System.out.println();

        wallet.printByCity("Kraków");
    }
}
