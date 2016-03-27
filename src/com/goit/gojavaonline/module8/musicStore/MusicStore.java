package com.goit.gojavaonline.module8.musicStore;

public class MusicStore {

    public void printCollection() {

        ListOfInstruments instruments = new ListOfInstruments();
        instruments.makeListOfInstruments();


        System.out.println("---------------------------------------------");
        System.out.println("| Instrument | Color     | Weight | Price   |");
        System.out.println("| Type       |           |        |         |");
        System.out.println("---------------------------------------------");

        for (int n = 0; n < instruments.getInstruments().size(); n++) {
            Object instrument = instruments.getInstruments().get(n);

            System.out.println(instrument);
        }
        System.out.println("---------------------------------------------");

    }


}




