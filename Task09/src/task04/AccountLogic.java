package task04;


import java.util.*;

/*
 *4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class AccountLogic {
    public static void blockAccount(Account account) {
        account.setBlocked(true);
    }

    public static void unblockAccount(Account account) {
        account.setBlocked(false);
    }



    public static int getSum100(Client client,Currency currency) {
        int sum = 0;
        TreeSet<Account> set = client.getSet();
        for (Account account : set) {
            if(account.getCurrency() == currency){
            sum += account.getValue100();}
        }
        return sum;
    }

    public static int getPosOrNegSum100(Client client, Currency currency, boolean positive) {
        int sum = 0;
        TreeSet<Account> set = client.getSet();
        for (Account account : set) {
            if (positive == account.getValue100() > 0 && account.getCurrency() == currency) {
                sum += account.getValue100();
            }
        }
        return sum;
    }

}
