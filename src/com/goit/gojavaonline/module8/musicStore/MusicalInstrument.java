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

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "| " + getType()+
                " \t | " + color +
                "\t |  " + weight +
                " \t  | " + price  + "  \t|";
    }
}
