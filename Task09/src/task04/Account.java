package task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 *4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account implements Comparable<Account> {
    private Client client;
    private boolean blocked;
    private Currency currency;
    private static int maxID = 0;
    private int id;
    private int value100;


    public Account(Client client, Currency currency, double value) {
        this.id = maxID;
        maxID++;
        this.client = client;
        this.currency = currency;
        this.value100 = (int) (value * 100);
        client.getSet().add(this);
    }

    @Override
    public int compareTo(Account a) {
        int dif = a.getCurrency().compareTo(this.getCurrency());
        if (dif == 0) {
            dif = this.getValue100() - a.getValue100();
        }
        return dif;
    }

    public static int getMaxID() {
        return maxID;
    }

    public int getId() {
        return id;
    }


    public Client getClient() {
        return client;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getValue100() {
        return value100;
    }

    public void setValue100(int value100) {
        this.value100 = value100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return blocked == account.blocked &&
                value100 == account.value100 &&
                Objects.equals(client, account.client) &&
                currency == account.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, blocked, currency, value100);
    }

    @Override
    public String toString() {
        return "Account{" +
                "client=" + client.getName() +
                ", \tblocked=" + blocked +
                ", \tcurrency=" + currency +
                ", \tid=" + id +
                ", \tvalue100=" + value100 +
                '}';
    }
}
