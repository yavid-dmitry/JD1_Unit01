package task03;

import java.util.ArrayList;
import java.util.List;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class State {
    private String name;
    private City capital;
    private List<Region> regionList;


    public State(String name, City capital, List<Region> regionList) {
        this.name = name;
        this.capital = capital;
        List<Region> checkedList = new ArrayList<Region>();
        for (Region region : regionList) {
            boolean unic = true;
            for (Region checkedR : checkedList) {
                if (region.equals(checkedR)) {
                    unic = false;
                    break;
                }

            }
            if (unic) {
                checkedList.add(region);
            }
        }

        this.regionList = checkedList;
    }

    public State(String name, City capital,Region...regionList) {
        this.name = name;
        this.capital = capital;
        List<Region> checkedList = new ArrayList<Region>();
        for (Region region : regionList) {
            boolean unic = true;
            for (Region checkedR : checkedList) {
                if (region.equals(checkedR)) {
                    unic = false;
                    break;
                }

            }
            if (unic) {
                checkedList.add(region);
            }
        }

        this.regionList = checkedList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

}


