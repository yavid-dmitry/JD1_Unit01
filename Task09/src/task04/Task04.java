package task04;

import java.util.Random;
import java.util.TreeSet;

/*
 *4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Task04 {
    public static void main(String[] args) {
        Client Vasya = new Client("Вася");
        Client Petya = new Client("Петя");
        Client Dima = new Client("Дима");
        Random random = new Random();
        Account a1 = new Account(Vasya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a2 = new Account(Vasya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a3 = new Account(Vasya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a4 = new Account(Vasya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a5 = new Account(Vasya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a6 = new Account(Vasya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a7 = new Account(Petya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a8 = new Account(Petya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a9 = new Account(Petya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a10 = new Account(Petya, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a11 = new Account(Dima, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a12 = new Account(Dima, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a13 = new Account(Dima, Currency.BYN, 10000 * random.nextDouble() - 5000);
        Account a14 = new Account(Dima, Currency.BYN, 10000 * random.nextDouble() - 5000);

        AccountLogic.blockAccount(a2);
        System.out.println("Распечатаем счета Васи");
        print(Vasya);
        int rub = AccountLogic.getSum100(Vasya,Currency.BYN) / 100;
        int kop = AccountLogic.getSum100(Vasya,Currency.BYN) % 100;
        System.out.println("Полная сумма на счетах:" + rub + " руб. " + kop + " коп.");

        rub = AccountLogic.getPosOrNegSum100(Vasya,Currency.BYN,true) / 100;
        kop = AccountLogic.getPosOrNegSum100(Vasya,Currency.BYN,true) % 100;
        System.out.println("Сумма на положительных счетах:" + rub + " руб. " + kop + " коп.");

        rub = AccountLogic.getPosOrNegSum100(Vasya,Currency.BYN,false) / 100;
        kop = AccountLogic.getPosOrNegSum100(Vasya,Currency.BYN,false) % 100;
        System.out.println("Сумма на отрицательных счетах:" + rub + " руб. " + kop + " коп.");
    }

    public static void print(Client client){
        TreeSet<Account> set= client.getSet();
        if (set != null){
            for(Account account: set){
                System.out.println(account);
            }
        }
    }

}
