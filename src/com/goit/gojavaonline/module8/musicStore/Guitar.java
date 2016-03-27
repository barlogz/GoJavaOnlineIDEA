package com.goit.gojavaonline.module8.musicStore;

public class Guitar extends MusicalInstrument {

    public Guitar(String color, int weight, int price) {
        super(color, weight, price);
    }

    @Override
    public String getType() {
        return "Guitar";
    }
}
