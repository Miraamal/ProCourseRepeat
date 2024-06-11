package org.example._09_06_24.map_queue;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> decease;
    private List<String> oldDecease;

    public History() {
        this.decease = new ArrayList<>();
        this.oldDecease = new ArrayList<>();
    }

    public List<String> getDecease() {
        return decease;
    }

    public List<String> getOldDecease() {
        return oldDecease;
    }

    @Override
    public String toString() {
        return "History{" +
                "decease=" + decease +
                ", oldDecease=" + oldDecease +
                '}';
    }
}
