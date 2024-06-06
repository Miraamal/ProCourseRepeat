package org.example._05_06_24.task_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainForBox {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(1.2,1.7,1.5,1.8));
        boxes.add(new HeavyBox(1.5,1.7,1.5,1.8));
        boxes.add(new HeavyBox(1.8,1.7,1.5,1.8));
        boxes.add(new HeavyBox(1.4,1.7,1.5,1.8));
        boxes.add(new HeavyBox(1.1,1.7,1.5,1.8));

        System.out.println(boxes);
        boxes.getFirst().setWeight(1.0);
        HeavyBox[] boxArray = boxes.toArray(new HeavyBox[6]);
        System.out.println(Arrays.toString(boxArray));
        boxes.removeLast();
        System.out.println(boxes);

        for (HeavyBox hb : boxes){
            hb.setLenght(hb.getLenght()*2);
            hb.setWidth(hb.getWeight()*2);
            hb.setDepth(hb.getDepth()*2);
        }
        System.out.println(boxes);

        boxes.clear();
        System.out.println(boxes);
    }
}
