package com.goit.gojavaonline.module8.musicStore;

public abstract class MusicalInstrument {

    public abstract String getType();
    public String color;
    public int weight;
    public int price;

    public MusicalInstrument(String color, int weight, int price) {
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" + getType() + "}";
    }
}
