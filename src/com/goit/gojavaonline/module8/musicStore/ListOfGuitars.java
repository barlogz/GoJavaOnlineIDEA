package com.goit.gojavaonline.module8.musicStore;

import java.util.ArrayList;
import java.util.List;

public class ListOfGuitars {

    public List<MusicalInstrument> guitars = new ArrayList<>();

    public List<MusicalInstrument> getGuitars() {
        return guitars;
    }

    public void makeListOfGuitars() {

        Guitar bassGuitar = new Guitar("Black", 4, 10000);
        Guitar electricGuitar = new Guitar("Red   ", 3, 1800);
        Guitar acousticGuitar = new Guitar("Woodean", 2, 500);

        guitars.add(bassGuitar);
        guitars.add(electricGuitar);
        guitars.add(acousticGuitar);

    }

    @Override
    public String toString() {
        return "ListOfGuitars{" +
                "guitars=" + guitars +
                '}';
    }
}
