package org.example._08_06_24.generic_2;

import org.example._08_06_24.entertaiments.Entertainment;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Ship ship = new Ship();

        TransportWrapper<Airplane> airplaneHolder = new TransportWrapper<>(airplane); // sozdali obertku i polojili tuda samolet
        TransportWrapper<Ship> shipHolder = new TransportWrapper<>(ship);
        Yacht yacht = new Yacht();
        TransportWrapper<Ship> shipHolder2 = new TransportWrapper<>(yacht);
        sail(ship);
        sail2(shipHolder);
        sail3(shipHolder2);
    }

    public static <T extends Ship> void sail(T transport) {
        System.out.println("its sail");
    }

    public static void sail2(TransportWrapper<? extends Ship> transportWrapper) {
        System.out.println("its sails");

    }
    public static void sail3(TransportWrapper<? super WarShip> transportWrapper) {
        System.out.println("its warship");

    }
    public static <T extends Ship & Entertainment> void sail2(T entertainmentShip) {
        System.out.println("lets have fun");

    }

}
