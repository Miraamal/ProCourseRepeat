package org.example._08_06_24.generic_2;

import org.example._08_06_24.entertaiments.Entertainment;

public class Yacht extends Ship implements Entertainment {

    @Override
    public void entertain() {
        System.out.println("Fishing");
    }
}
