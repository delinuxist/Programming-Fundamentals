package org.example.jewelry;

public class Ring extends Base_Jewelry {
    private float diameter;

    public Ring(String name) {
        super(name);
    }

    public float getDiameter() {
        return diameter;
    }
}
