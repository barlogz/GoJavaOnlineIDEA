package com.goit.gojavaonline.module8.musicStore;

public class Trumpet extends MusicalInstrument {

    private static String color;
    private static int weight;
    private static int price;

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Trumpet.color = color;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Trumpet.weight = weight;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Trumpet.price = price;
    }

    @Override
    public String getType() {
        return "Trumpet";
    }
}
