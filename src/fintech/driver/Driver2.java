package fintech.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Locale;

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
        sc.useLocale(Locale.US);
        Map<String, Account> akun = new HashMap<>();

        String command = sc.nextLine();
        if(command.equals("create-account")){
            String owner = sc.nextLine();
            String accountname = sc.nextLine();
            Account create = new Account (owner, accountname);
            akun.put(accountname, create);
            System.out.println(create.toString());
        }

        command = sc.nextLine();
        if(command.equals("create-transaction")){
            String accountname = sc.nextLine();
            Account account = akun.get(accountname);
            Double amount = sc.nextDouble();
            sc.nextLine();
            String postedat = sc.nextLine();
            String note = sc.nextLine();
            Transaction create = new Transaction(account, amount, postedat, note);
            create.sumamount(amount);
            System.out.println(create.toString());
        }
        else{
            System.out.println("Invalid command");
        }
    sc.close();
    }

}