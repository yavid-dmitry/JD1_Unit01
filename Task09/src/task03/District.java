package task03;

import java.util.Objects;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class District {
    private String name;
    private City districtCenter;
    private double area;

    public District(String name, City districtCenter, double area) {
        this.name = name;
        this.districtCenter = districtCenter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof District)) return false;
        District district = (District) o;
        return Double.compare(district.area, area) == 0 &&
                Objects.equals(districtCenter, district.districtCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtCenter, area);
    }
}
