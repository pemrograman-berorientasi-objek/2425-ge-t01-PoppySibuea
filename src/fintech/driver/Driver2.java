package fintech.driver;

import java.util.Scanner;

import fintech.model.Account;
import fintech.model.Transaction;

/**
 * @author 12S23004 Poppy Sibuea
 * @author 12S23026 Arif Doloksaribu
 */
public class Driver2 {

    public static void main(String[] _args) {

        // codes
        Scanner sc = new Scanner(System.in);  
        String command = sc.nextLine();

        if(command.equals("create-account")){
            String owner = sc.nextLine();
            String accountname = sc.nextLine();
            Account create = new Account (owner, accountname);
            System.out.println(create.toString());
        }
        else if(command.equals("create-transaction")){
            String accountname = sc.nextLine();
            Double amount = sc.nextDouble();
            sc.nextLine();
            String postedat = sc.nextLine();
            String note = sc.nextLine();
            Account account = new Account("owner", accountname);
            Transaction create = new Transaction(account, amount, postedat, note);
            System.out.println(create.toString());
        }
        else{
            System.out.println("Invalid command");
        }
        sc.close();
    }

}