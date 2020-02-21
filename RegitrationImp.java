package PayMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegitrationImp implements RegostrationInterface {
    private Scanner sc = new Scanner(System.in);

    private List<Account> userList = new ArrayList<>();
    private Account signedInUser;

    @Override
    public void SingUp() {
        System.out.println(" Enter TelNumber ");
        String Telnumber = sc.next();
        if (!(Ishave1(Telnumber))) {
            System.out.println(" Password ");
            String password = sc.next();
            System.out.println(" TelCode ");
            int TelCode = sc.nextInt();
            userList.add(new Account(Telnumber, password, TelCode));
            System.out.println(" Welcome");
        } else {
            SingUp();
        }
    }

    @Override
    public boolean SingIn() {
        boolean IsSing = false;
        System.out.println(" Enter TelNumber ");
        String Telnumber = sc.next();
        System.out.println(" Password ");
        String password = sc.next();
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getPhoneNumber().equals(Telnumber) && userList.get(i).getPassword().equals(password)) {
                signedInUser = userList.get(i);
                IsSing = true;
            }
        }
        return IsSing;
    }

    @Override
    public Account getSignedInUser() {
        return signedInUser;
    }

    @Override
    public List<Account> getAllUsers() {
        return userList;
    }

    private boolean Ishave1(String Telnumber) {
        boolean IsSing = false;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getPhoneNumber().equals(Telnumber)) {
                IsSing = true;
                break;
            }
        }
        return IsSing;

    }
}
