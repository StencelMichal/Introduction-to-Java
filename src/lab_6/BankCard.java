package lab_6;

import lab_5.BussinesCard;

import java.util.ArrayList;

public class BankCard extends BussinesCard {

    private String accountNumber;

    BankCard(String name , String surname , String phoneNumber , String accountNumber ){
        super( name , surname , phoneNumber);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected ArrayList<String> getLines(){
        ArrayList<String> lines = super.getLines();
        lines.add(accountNumber);
        return lines;
    }

    protected char getBorderChar(){
        return '$';
    }

    @Override
    public boolean equals(Object obj) {
        boolean res =  super.equals(obj);

        if (!res){
            return false;
        }

        BankCard card = (BankCard) obj;

        return accountNumber.equals(card.getAccountNumber());
    }
}
