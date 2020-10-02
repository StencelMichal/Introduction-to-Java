package lab_5;

import java.util.ArrayList;
import java.util.Objects;


public class BussinesCard {

    public final static char BORDER_CHAR = '*';
    private String name;
    private String surname;
    private String phone;


    public  BussinesCard(){
        this("Piotr" , "Budynek" , "123456789");
    }

    public BussinesCard(String name, String surname, String phone){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return surname;
    }

    public String getPhone(){
        return phone;
    }

    public void setName( String name){
        this.name = name;
    }

    public void setSurname( String surname){
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    protected char getBorderChar(){
        return BORDER_CHAR;
    }

    @Override
    public String toString() {
        ArrayList<String> lines = getLines();
        String card = "";

        int maxLength = getMaxLength(lines);

        String borderLine = "";
        for (int i = 0; i < maxLength + 2; i++) {
            borderLine += getBorderChar();
        }

        card += borderLine;

        for (String line : lines) {
            int lengthDiff = maxLength - line.length();

            for (int i = 0; i < lengthDiff; i++) {
                line += " ";
            }

            line = getBorderChar() + line + getBorderChar();

            card += '\n' + line;
        }

        card += '\n' + borderLine;

        return card;
    }

    @Override
    public boolean equals(Object obj) {

        if( obj == this)
            return true;

        if(!(obj instanceof BussinesCard))
            return false;

        BussinesCard card = (BussinesCard) obj;
        if(!name.equals(card.getName())) return false;
        if(!surname.equals(card.getSurname())) return false;
        if(!phone.equals(card.getPhone())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone);
    }

    private int getMaxLength(ArrayList<String> lines) {
        int maxLength = 0;

        for (String line : lines) {
            int lineLength = line.length();

            if (lineLength > maxLength) {
                maxLength = lineLength;
            }
        }

        return maxLength;
    }

    protected ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();

        lines.add(name + " " + surname);
        lines.add("tel. " + phone);

        return lines;
    }

}
