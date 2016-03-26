package com.goit.gojavaonline.module8.musicStore;

public class Guitar extends MusicalInstrument {

    private static String color;
    private static int weight;
    private static int price;

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Guitar.color = color;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Guitar.weight = weight;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Guitar.price = price;
    }

    @Override
    public String getType() {
        return "Guitar";
    }
}
