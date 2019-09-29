package task03;
/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StateLogic {
    public static double getArea(State state) {
        double area = 0;
        for (Region r : state.getRegionList()) {
            area += RegionLogic.getArea(r);
        }
        return area;
    }

    public static boolean addRegion(State state, Region region) {
        boolean isPosible = true;
        for (Region r : state.getRegionList()) {
            if (r.equals(region)) {
                isPosible = false;
                return isPosible;
            }
            state.getRegionList().add(region);
        }
        return isPosible;
    }

    public static boolean removeDistrict(State state, Region region) {
        List<Region> list = state.getRegionList();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(region)) {
                index = i;
            }
        }
        if (index >= 0) {
            list.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public static String getAllRegion(State state) {
        String allRegion = "";
        List<String> list = new ArrayList<>();
        for (Region r : state.getRegionList()) {
            list.add(r.getName());
        }
        Collections.sort(list);
        for (String r : list) {
            allRegion += r + ", ";
        }
        return allRegion;
    }


    public static String getStateInfo(State state) {
        String info;

        info = "Страна: " + state.getName() + "\nКоличество областей: " + state.getRegionList().size() + "\nПлощадь: " +
                StateLogic.getArea(state) + "\nОбласти: " + getAllRegion(state);
        return info;
    }
}


