package PayMe;

import java.util.ArrayList;
import java.util.List;

public class RegistrationPayMe {
    private String TelNumber;
    private String Password;
    private int TelCod;
    private List<CreatCard> creatCards = new ArrayList<>();

    public RegistrationPayMe(String TelNumber, String password, int telCod) {
        this.TelNumber = TelNumber;
        Password = password;
        TelCod = telCod;

    }

    public RegistrationPayMe(String telNumber, String password, int telCod, List<CreatCard> creatCards) {
        TelNumber = telNumber;
        Password = password;
        TelCod = telCod;
        this.creatCards = creatCards;
    }

    public String getTelNumber() {
        return TelNumber;
    }

    public void setTelNumber(String TelNumber) {
        this.TelNumber = TelNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getTelCod() {
        return TelCod;
    }

    public void setTelCod(int telCod) {
        TelCod = telCod;
    }

    public List<CreatCard> getCreatCards() {
        return creatCards;
    }

    public void setCreatCards(List<CreatCard> creatCards) {
        this.creatCards = creatCards;
    }

    @Override
    public String toString() {
        return "RegistrationPayMe{" +
                "TelNumber='" + TelNumber + '\'' +
                ", Password='" + Password + '\'' +
                ", TelCod=" + TelCod +
                ", creatCards=" + creatCards +
                '}';
    }
}
