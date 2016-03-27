package com.goit.gojavaonline.module8.musicStore;

import java.util.Comparator;

public class InstrumentColorComparator implements Comparator<MusicalInstrument> {
    @Override
    public int compare(MusicalInstrument instrument1, MusicalInstrument instrument2) {
        String color1 = instrument1.getColor().toUpperCase();
        String color2 = instrument2.getColor().toUpperCase();

        //ascending order
        return color1.compareTo(color2);
        //descending order
        //return color2.compareTo(color1);
    }

}





