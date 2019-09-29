package task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Region {
    private String name;
    private City regionCenter;
    private List<District> districtList;


    public Region(String name, City regionCenter, List<District> districtList) {
        this.name = name;
        this.regionCenter = regionCenter;
        List<District> checkedList = new ArrayList<District>();
        for (District d : districtList) {
            boolean unic = true;
            for (District checkedD : checkedList) {
                if (d.equals(checkedD)) {
                    unic = false;
                    break;
                }

            }
            if (unic) {
                checkedList.add(d);
            }
        }

        this.districtList = checkedList;
    }

    public Region(String name, City regionCenter, District... districtList) {
        this.name = name;
        this.regionCenter = regionCenter;
        List<District> checkedList = new ArrayList<District>();
        for (District d : districtList) {
            boolean unic = true;
            for (District checkedD : checkedList) {
                if (d.equals(checkedD)) {
                    unic = false;
                    break;
                }

            }
            if (unic) {
                checkedList.add(d);
            }
        }

        this.districtList = checkedList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return Objects.equals(regionCenter, region.regionCenter) &&
                Objects.equals(districtList, region.districtList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCenter, districtList);
    }


}
