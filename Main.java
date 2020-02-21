package PayMe;

import Facebook1245.Registrationinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegostrationInterface regostrationInterface = new RegitrationImp();
        List<CreatCard> creatCardc = new ArrayList<>();

        while (true) {
            System.out.println(" 1-> SingUp " +
                    "2-> SingIn");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    regostrationInterface.SingUp();
                    break;
                case 2:
                    if (regostrationInterface.SingIn()) {
                        Account signedInUser = regostrationInterface.getSignedInUser();
                        CreatCardInterface creatCardInterface = new CreatCradImp(regostrationInterface.getAllUsers(), signedInUser);
                        while (true) {
                            boolean Ishave = false;
                            System.out.println("1-> Card Number " +
                                    " 2-> AddMoney " +
                                    "3-> delete Money " +
                                    " 4-> CardPerevodCard " +
                                    " 5-> AllCard " +
                                    " 6-> ExitCard ");
                            int n1 = sc.nextInt();
//                            CreatCardInterface creatCardInterface = new CreatCradImp(creatCardc);
                            switch (n1) {
                                case 1:
                                    creatCardInterface.AddCard();
                                    break;
                                case 2:
                                    creatCardInterface.AddMoneyCard();
                                    break;
                                case 3:
                                    creatCardInterface.DeletMoneyCard();
                                    break;
                                case 4:
                                    creatCardInterface.CardPerevodCard();
                                    break;
                                case 5:
                                    creatCardInterface.AllCard();
                                    break;
                                case 6:
                                    Ishave = true;
                                    break;
                            }
                            if (Ishave) {
                                break;
                            }
                        }
                    }
                    break;
            }
        }
    }
}
