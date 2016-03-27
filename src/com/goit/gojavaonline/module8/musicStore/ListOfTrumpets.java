package com.goit.gojavaonline.module8.musicStore;

import java.util.ArrayList;
import java.util.List;

public class ListOfTrumpets {

    public List<MusicalInstrument> trumpets = new ArrayList<>();

    public List<MusicalInstrument> getTrumpets() {
        return trumpets;
    }

    public void makeListOfTrumpets () {

        Trumpet mendini = new Trumpet("Silver", 6, 300);
        Trumpet jeanPaul = new Trumpet("Gold  ", 5, 200);
        Trumpet merano = new Trumpet("Blue  ", 6, 99);

        trumpets.add(mendini);
        trumpets.add(jeanPaul);
        trumpets.add(merano);
    }

    @Override
    public String toString() {
        return "ListOfTrumpets{" +
                "trumpets=" + trumpets +
                '}';
    }
}
