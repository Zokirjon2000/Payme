package PayMe;

import java.util.List;

public interface RegostrationInterface {
    void SingUp();

    boolean SingIn();

    Account getSignedInUser();

    List<Account> getAllUsers();

}
