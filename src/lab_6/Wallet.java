package lab_6;

import lab_5.BussinesCard;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<BussinesCard> cards;

    Wallet(){
        cards = new ArrayList<>();
    }

    public void add( BussinesCard card ){
       /* if(obj instanceof BussinesCard){
            BussinesCard newCard = (BussinesCard) obj;
            cards.add(newCard);
        }*/
       cards.add(card);
    }

    public void printByCity( String city) {
        for (BussinesCard card :
                cards) {
            if(card instanceof BussinesCardWithCity){
                if(((BussinesCardWithCity) card).getCity().equals(city)){
                    System.out.println(card);
                }
            }
        }
    }

    public ArrayList<BussinesCard> getByCity( String city ){
        ArrayList<BussinesCard> cardsByCities = new ArrayList<>();

        for ( BussinesCard card:
             cards) {
            if(card instanceof BussinesCardWithCity ){
                if(((BussinesCardWithCity) card).getCity().equals(city)){
                    cardsByCities.add(card);
                }
            }
        }

        return cardsByCities;
    }

    @Override
    public String toString() {
        StringBuilder cardsInWallet = new StringBuilder();
        for (BussinesCard card :
                cards) {
            cardsInWallet.append('\n').append(card.toString());
        }

        return cardsInWallet.toString();
    }
}
