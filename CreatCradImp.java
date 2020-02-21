package PayMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatCradImp implements CreatCardInterface {
    private Scanner sc = new Scanner(System.in);
    private List<Account> registrationPayMe;
    private Account signedInUser;

    public CreatCradImp(List<Account> registrationPayMe, Account signedInUser) {
        this.registrationPayMe = registrationPayMe;
        this.signedInUser = signedInUser;
    }

    @Override
    public void AddCard() {
        System.out.println(" Enter name ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(" Enter numberCard ");
        sc = new Scanner(System.in);
        String numberCard = sc.nextLine();
        System.out.println(" Enter date ");
        String n = sc.next();
        CreatCard creatCard = new CreatCard(name, numberCard, n);
        signedInUser.getCards().add(creatCard);
    }

    @Override
    public void AddMoneyCard() {
        for (int i = 0; i < signedInUser.getCards().size(); i++) {
            System.out.println((i + 1) + "->" + signedInUser.getCards().get(i));
        }
        System.out.println(" pul qoshaydigon kartani tanlang ");
        int d = sc.nextInt();
        for (int i = 0; i < signedInUser.getCards().size(); i++) {
            if (d == i + 1) {
                System.out.println(" kiritaydigon sumani kiriting ");
                int sum = sc.nextInt();
                signedInUser.getCards().get(i).setSum(signedInUser.getCards().get(i).getSum() + sum);
            }
        }

    }

    @Override
    public void DeletMoneyCard() {
        for (int i = 0; i < signedInUser.getCards().size(); i++) {
            System.out.println((i + 1) + "->" + signedInUser.getCards().get(i));
        }
        System.out.println(" pul yechaydigon kartani tanlang   ");
        int d = sc.nextInt();
        for (int i = 0; i < signedInUser.getCards().size(); i++) {
            if (d == i + 1) {
                System.out.println("sum");
                int sum = sc.nextInt();
                if ((signedInUser.getCards().get(i).getSum() - sum) < 0) {
                    System.err.println(" Operatsiya amalga oshirilmadi ");
                } else {
                    signedInUser.getCards().get(i).setSum(signedInUser.getCards().get(i).getSum() - sum);
                }
            }
        }

    }

    @Override
    public void CardPerevodCard() {
        System.out.println("Qaysi kartangizdan pul o'tkazmoqchisiz?");
        int cardCounter = 1;
        for (CreatCard creatCard : signedInUser.getCards()) {
            System.out.println(cardCounter++ + " -> " + creatCard);
        }
        int myChosenCardIndex = sc.nextInt() - 1;
        CreatCard myChosenCard = signedInUser.getCards().get(myChosenCardIndex);
        for (int i = 0; i < registrationPayMe.size(); i++) {
            System.out.println((i + 1) + "->" + registrationPayMe.get(i));

        }
        System.out.println(" Siz kimga pul o'tkazmoqchisiz?  ");
        int d = sc.nextInt();
        Account chosenUser = registrationPayMe.get(d - 1);
        for (int i = 0; i < chosenUser.getCards().size(); i++) {
            System.out.println((i + 1) + " -> " + chosenUser.getCards().get(i));
        }
        System.out.println("Qaysi kartaga pul o'tkazmoqchisiz");
        int sendCardIndex = sc.nextInt() - 1;
        CreatCard sendCard = chosenUser.getCards().get(sendCardIndex);
        System.out.println("Qancha o'tkazmoqchisiz?");
        int sendAmount = sc.nextInt();
        sendCard.setSum(sendCard.getSum() + sendAmount);
        myChosenCard.setSum(myChosenCard.getSum() - sendAmount);
        System.out.println("Pul muvaffaqiyatli o'tkazildi!");
    }

    @Override
    public void AllCard() {
        for (int i = 0; i < signedInUser.getCards().size(); i++) {
            System.out.println(signedInUser.getCards().get(i));
        }
    }

}