package org.example._10_06_24;

public class Insurance {
    private final String company;
    private final int number;

    public Insurance(String company, int number) {
        this.company = company;
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "company='" + company + '\'' +
                ", number=" + number +
                '}';
    }
}
