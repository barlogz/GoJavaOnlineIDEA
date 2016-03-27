package com.goit.gojavaonline.module8.musicStore;

import java.util.ArrayList;

public class MusicStore {

    public static void main(String[] args) {

        //guitar list
//        Guitar bassGuitar = new Guitar("Black", 4, 10000);
//        Guitar electricGuitar = new Guitar("Red", 3, 1800);
//        Guitar acousticGuitar = new Guitar("Woodean", 2, 500);
//
//        List<MusicalInstrument> guitars = new ArrayList<>();
//        guitars.add(bassGuitar);
//        guitars.add(electricGuitar);
//        guitars.add(acousticGuitar);

        ListOfGuitars guitarsList = new ListOfGuitars();
        guitarsList.makeListOfGuitars();

//        Piano synthesizers = new Piano("Silver", 4, 300);

//        Piano digitalPiano = new Piano("White", 25, 2000);
//        Piano acousticPiano = new Piano("Black", 60, 4000);
//
//        List<MusicalInstrument> pianos = new ArrayList<>();
//        pianos.add(synthesizers);
//        pianos.add(digitalPiano);
//        pianos.add(acousticPiano);

        ListOfPianos pianosList = new ListOfPianos();
        pianosList.makeListOfPianos();

//        Trumpet mendini = new Trumpet("Silver", 6, 300);
//        Trumpet jeanPaul = new Trumpet("Gold", 5, 200);
//        Trumpet merano = new Trumpet("Blue", 6, 99);
//
//        List<MusicalInstrument> trumpets = new ArrayList<>();
//        trumpets.add(mendini);
//        trumpets.add(jeanPaul);
//        trumpets.add(merano);

        ListOfTrumpets trumpetsList = new ListOfTrumpets();
        trumpetsList.makeListOfTrumpets();

        ArrayList<MusicalInstrument> instruments = new ArrayList<>();
        instruments.addAll(guitarsList.getGuitars());
        instruments.addAll(pianosList.getPianos());
        instruments.addAll(trumpetsList.getTrumpets());


//        System.out.println(instruments);

//        System.out.println("collectionList.size()=" + instruments.size());
        //new GFrame();
//        System.out.println(instruments.get(0).color);
        System.out.println("------------------------------------------------------");
        System.out.println("|Super   |  Object      | Object    |Object | Object |");
        System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
        System.out.println("------------------------------------------------------");

        for (int n = 0; n < instruments.size(); n++) {
            Object o = instruments.get(n);

            System.out.println(o);
        }
        System.out.println("------------------------------------------------------");

    }


}




