package org.example._08_06_24.generic_2;

import org.example._08_06_24.entertaiments.Entertainment;

public class Liner extends Ship implements Entertainment {
    @Override
    public void entertain() {
        System.out.println("Pool party");
    }
}
