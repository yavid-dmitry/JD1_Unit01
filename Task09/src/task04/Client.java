package task04;

import java.util.Objects;
import java.util.TreeSet;

/*
 *4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Client {
    private String name;
    private int id;
    private static int maxID = 0;
    private TreeSet<Account> set;

    public Client(String name) {
        this.name = name;
        maxID++;
        id = maxID;
        set = new TreeSet<Account>();
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public TreeSet<Account> getSet() {
        return set;
    }
}
