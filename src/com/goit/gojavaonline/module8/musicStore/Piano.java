package com.goit.gojavaonline.module8.musicStore;

public class Piano extends MusicalInstrument {

    private static String color;
    private static int weight;
    private static int price;

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Piano.color = color;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Piano.weight = weight;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Piano.price = price;
    }

    @Override
    public String getType() {
        return "Piano";
    }
}
