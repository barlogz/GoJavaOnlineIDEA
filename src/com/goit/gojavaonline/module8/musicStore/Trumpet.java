package com.goit.gojavaonline.module8.musicStore;

public class Trumpet extends MusicalInstrument {

    public Trumpet(String color, int weight, int price) {
        super(color, weight, price);
    }

    @Override
    public String getType() {
        return "Trumpet";
    }
}
