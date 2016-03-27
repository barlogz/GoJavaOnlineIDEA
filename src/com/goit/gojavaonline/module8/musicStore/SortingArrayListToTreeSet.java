package com.goit.gojavaonline.module8.musicStore;

import java.util.TreeSet;

public class SortingArrayListToTreeSet {

    public void sortingToTreeSet () {

        ListOfInstruments instruments = new ListOfInstruments();
        instruments.makeListOfInstruments();

        TreeSet<MusicalInstrument> sortedInstruments = new TreeSet<>(new InstrumentPriceComparator()
                .thenComparing(new InstrumentColorComparator()));
        sortedInstruments.addAll(instruments.getInstruments());

        System.out.println("Sorted list by price, than by color:");
        for (MusicalInstrument s : sortedInstruments) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------");

    }

}
