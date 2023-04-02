package org.example.jewelry;

import org.example.enums.PreciousMaterial;

public abstract class Base_Jewelry implements Comparable<Base_Jewelry> {
    private String name;
    private float price;

    private PreciousMaterial material;

    Base_Jewelry(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public PreciousMaterial getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Base_Jewelry jewelry) {
        return name.compareTo(jewelry.getName());
    }

    @Override
    public String toString() {
        return "Base_Jewelry{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", material=" + material +
                '}';
    }
}
