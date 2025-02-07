package fintech.driver;
import fintech.model.Account;
import java.util.*;

/**
 * @author 12S23004 Poppy Sibuea
 * @author 12S23026 Arif Doloksaribu
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);  
        String command = sc.nextLine();

        if(command.equals("create-account")){
            String owner = sc.nextLine();
            String accountname = sc.nextLine();
            Account create = new Account (owner, accountname);
            System.out.println(create.toString());
        }
        else{
            System.out.println("Invalid command");
        }
        sc.close();
    }

}