package task03;

import java.util.List;

public class RegionLogic {
    public static double getArea(Region region) {
        double area = 0;
        for (District d : region.getDistrictList()) {
            area += d.getArea();
        }
        return area;
    }

    public static boolean addDistrict(Region region, District district) {
        boolean isPosible = true;
        for (District d : region.getDistrictList()) {
            if (d.equals(district)) {
                isPosible = false;
                return isPosible;
            }
            region.getDistrictList().add(district);
        }
        return isPosible;
    }

    public static boolean removeDistrict(Region region, District district) {
        List<District> list = region.getDistrictList();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(district)) {
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

}
