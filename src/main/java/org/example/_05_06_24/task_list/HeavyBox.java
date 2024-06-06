package org.example._05_06_24.task_list;

public class HeavyBox {
    private static long count = 0;
    private final long id;
    private  double weight;
    private  double lenght;
    private  double width;
    private  double depth;

    public static long getCount() {
        return count;
    }

    public long getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }



    public HeavyBox(double weight, double lenght, double width, double depth) {
        this.id = count++;
        this.weight = weight;
        this.lenght = lenght;
        this.width = width;
        this.depth = depth;



    }
    @Override
    public String toString() {
        return "HeavyBox{" +
                "id=" + id +
                ", weight=" + weight +
                ", lenght=" + lenght +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
