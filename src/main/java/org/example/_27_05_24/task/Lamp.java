package org.example._27_05_24.task;

import java.awt.*;

public class Lamp {
    private static Lamp mostPowerful;
    static {
        System.out.println("Hi from static block of initialization");
        System.out.println(mostPowerful);
    }

    private final LampType type;
    private final int power;
    private final boolean isEnergy;
    private final Color color;
    private final double lumen;

    public Lamp(LampType type, int power, boolean isEnergy, Color color, double lumen) {
        this.type = type;
        this.power = power;
        this.isEnergy = isEnergy;
        this.color = color;
        this.lumen = lumen;
        if (mostPowerful==null || this.power > mostPowerful.power){
            mostPowerful = this;
        }
    }

    public LampType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public boolean isEnergy() {
        return isEnergy;
    }

    public Color getColor() {
        return color;
    }

    public double getLumen() {
        return lumen;
    }

    public static Lamp getMostPowerful() {
        return mostPowerful;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "type=" + type +
                ", power=" + power +
                ", isEnergy=" + isEnergy +
                ", color=" + color +
                ", lumen=" + lumen +
                '}';
    }
}
