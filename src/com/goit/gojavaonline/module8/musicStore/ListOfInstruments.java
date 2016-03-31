package com.goit.gojavaonline.module8.musicStore;

import java.util.ArrayList;
import java.util.List;

public class ListOfInstruments {

    public List<MusicalInstrument> instruments = new ArrayList<>();

    public List<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public void makeListOfInstruments() {
        ListOfGuitars guitarsList = new ListOfGuitars();
        guitarsList.makeListOfGuitars();

        ListOfPianos pianosList = new ListOfPianos();
        pianosList.makeListOfPianos();

        ListOfTrumpets trumpetsList = new ListOfTrumpets();
        trumpetsList.makeListOfTrumpets();

        instruments.addAll(guitarsList.getGuitars());
        instruments.addAll(pianosList.getPianos());
        instruments.addAll(trumpetsList.getTrumpets());

    }

    @Override
    public String toString() {
        return "ListOfInstruments{" +
                "instruments=" + instruments +
                '}';
    }
}
