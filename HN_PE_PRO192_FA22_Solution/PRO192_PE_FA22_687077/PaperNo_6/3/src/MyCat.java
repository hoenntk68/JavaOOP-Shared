
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hp
 */
public class MyCat implements ICat {

    @Override
    public int f1(List<Cat> list) {
        int count = 0;
        //counting
        for (Cat c : list) {
            if (c.getArea().contains("A") || c.getArea().contains("B")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cat> list) {
        //tim max
        int max = Integer.MIN_VALUE;
        for (Cat c : list) {
            if (max < c.getLeg()) {
                max = c.getLeg();
            }
        }
        //kiem tra xem co it nhat 2 phan tu dat max leg --> xoa
        if (list.size() > 0) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getLeg() == max) {
                    count++;
                    if (count == 2) {
                        list.remove(i);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void f3(List<Cat> list) {
        //Cach 1: bubble sort: 4 phan tu dau tien
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (getUnitDigit(list.get(i)) > getUnitDigit(list.get(j))) {
                    Collections.swap(list, i, j);
                }
            }
        }

        //Cach 2:
//        //b1: tao list2 chua 4 phan tu dau tien cua list
//        List<Cat> list2 = new ArrayList<Cat>();
//        for (int i = 0; i < 4; i++) {
//            list2.add(list.get(i));
//        }
//        //b2: sort list2
//        Collections.sort(list2);
//        //b3: gan lai 4 phan tu cua list2 vao list 
//        for (int i = 0; i < 4; i++) {
//            list.set(i, list2.get(i));
//        }
    }

    public static int getUnitDigit(Cat cat) {
        return cat.getLeg() % 10;
    }

}
