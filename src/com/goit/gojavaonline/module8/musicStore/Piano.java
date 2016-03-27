package com.goit.gojavaonline.module8.musicStore;

public class Piano extends MusicalInstrument {

    public Piano(String color, int weight, int price) {
        super(color, weight, price);
    }

    @Override
    public String getType() {
        return "Piano";
    }
}
