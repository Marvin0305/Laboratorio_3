package presentation;

import domain.Client;
import log.Log;
import log.SavingAccount;
import java.util.Date;
import domain.Client;
import log.CurrentAccount;

public class LogTesting {

    public LogTesting() {
    }

    public void test() {

        Client clients[] = new Client[10];

        Client client1 = new Client("7-0295-0204", "Marvin", "64401343", "Colina");
        Client client2 = new Client("1-1295-0284", "Laura", "87237483", "Chepe");

        clients[0] = client1;
        clients[1] = client2;
        
        System.out.println(client1.toString());
        System.out.println(client2.toString());

        SavingAccount account1 = new SavingAccount("2024-03-15", 12, 15, "104560", 25000, client1) {
        };
        SavingAccount account2 = new SavingAccount("2024-03-15", 6, 15, "10000", 25000, client2) {
        };
        
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        
        CurrentAccount currentAccount1 = new CurrentAccount("30001", 10000, client1, 5000);
        CurrentAccount currentAccount2 = new CurrentAccount("30002", 15000, client2, 10000);
        
        Log log[] = new Log[5];

        log[0] = new Log(1, "Saving Amount", new Date(), account1, 7000);
        log[1] = new Log(1, "Withdraw Amount", new Date(), account2, 5000);
        log[2] = new Log(3, "Withdraw Amount", new Date(), currentAccount1, 8000);
        log[3] = new Log(4, "Saving Amount", new Date(), currentAccount2, 12000);

        for (Log entry: log) {
            if (entry != null) {
                System.out.println(entry.toString());
            }
        }

    }
    public static void main(String[] args) {
        LogTesting tester = new LogTesting();
        tester.test();
    }

}
