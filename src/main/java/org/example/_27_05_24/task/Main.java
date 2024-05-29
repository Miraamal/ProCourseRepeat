package org.example._27_05_24.task;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Lamp.getMostPowerful());
        System.out.println("Start program");
         Lamp lamp1 = new Lamp(LampType.HALOGEN,200,true, Color.white,250);
         Lamp lamp2 = new Lamp(LampType.LED,120,true,Color.yellow,200);
         Lamp lamp3 = new Lamp(LampType.LUMINESCENT,250,false,Color.LIGHT_GRAY,300);
        System.out.println(Lamp.getMostPowerful());
    }
}
