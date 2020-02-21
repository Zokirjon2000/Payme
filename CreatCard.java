package PayMe;

public class CreatCard {
    private String creatname;
    private String mumberCard;
    private String date;
    private int Sum;

    public CreatCard(String creatname, String mumberCard, String date, int sum) {
        this.creatname = creatname;
        this.mumberCard = mumberCard;
        this.date = date;
        Sum = sum;
    }

    public CreatCard(String creatname, String mumberCard, String date) {
        this.creatname = creatname;
        this.mumberCard = mumberCard;
        this.date = date;
    }

    public String getCreatname() {
        return creatname;
    }

    public void setCreatname(String creatname) {
        this.creatname = creatname;
    }

    public String getMumberCard() {
        return mumberCard;
    }

    public void setMumberCard(String mumberCard) {
        this.mumberCard = mumberCard;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSum() {
        return Sum;
    }

    public void setSum(int sum) {
        Sum = sum;
    }

    @Override
    public String toString() {
        return "CreatCard{" +
                "creatname='" + creatname + '\'' +
                ", mumberCard='" + mumberCard + '\'' +
                ", date='" + date + '\'' +
                ", Sum=" + Sum +
                '}';
    }
}
