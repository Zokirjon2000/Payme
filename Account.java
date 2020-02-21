package PayMe;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private int telCode;
    private int Sum;
    private String mumberCard;
    private List<CreatCard> cards = new ArrayList<>();

    public Account(String phoneNumber, String password, int telCode) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.telCode = telCode;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<CreatCard> getCards() {
        return cards;
    }

    public void setCards(List<CreatCard> cards) {
        this.cards = cards;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelCode() {
        return telCode;
    }

    public void setTelCode(int telCode) {
        this.telCode = telCode;
    }
    public int getSum() {
        return Sum;
    }

    public void setSum(int sum) {
        Sum = sum;
    }

    public String getMumberCard() {
        return mumberCard;
    }

    public void setMumberCard(String mumberCard) {
        this.mumberCard = mumberCard;
    }

//    @Override
//    public String toString() {
//        return "Account{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Account{" +
                "cards=" + cards +
                '}';
    }
}
