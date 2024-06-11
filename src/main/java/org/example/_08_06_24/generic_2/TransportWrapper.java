package org.example._08_06_24.generic_2;

public class TransportWrapper <T extends Transport> {
    private T value;

    public TransportWrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
