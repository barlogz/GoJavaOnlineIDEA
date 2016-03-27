package com.goit.gojavaonline.module8.musicStore;

import java.util.ArrayList;
import java.util.List;

public class ListOfPianos {

    public List<MusicalInstrument> pianos = new ArrayList<>();

    public List<MusicalInstrument> getPianos() {
        return pianos;
    }

    public void makeListOfPianos() {
        Piano synthesizers = new Piano("Silver", 4, 300);
        Piano digitalPiano = new Piano("White", 25, 2000);
        Piano acousticPiano = new Piano("Black", 60, 4000);

        pianos.add(synthesizers);
        pianos.add(digitalPiano);
        pianos.add(acousticPiano);
    }

    @Override
    public String toString() {
        return "ListOfPianos{" +
                "pianos=" + pianos +
                '}';
    }
}
