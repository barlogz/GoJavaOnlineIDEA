package com.goit.gojavaonline.module8.musicStore;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class MusicStore {

    public static void main(String[] args) {

        //guitar list
        Guitar bassGuitar = new Guitar("Black", 4, 10000);
        Guitar electricGuitar = new Guitar("Red", 3, 1800);
        Guitar acousticGuitar = new Guitar("Woodean", 2, 500);

        Piano synthesizers = new Piano("Silver", 4, 300);
        Piano digitalPiano = new Piano("White", 25, 2000);
        Piano acousticPiano = new Piano("Black", 60, 4000);

        Trumpet mendini = new Trumpet("Silver", 6, 300);
        Trumpet jeanPaul = new Trumpet("Gold", 5, 200);
        Trumpet merano = new Trumpet("Blue", 6, 99);


        List<MusicalInstrument> guitars = new ArrayList<>();
        guitars.add(bassGuitar);
        guitars.add(electricGuitar);
        guitars.add(acousticGuitar);

        List<MusicalInstrument> pianos = new ArrayList<>();
        pianos.add(synthesizers);
        pianos.add(digitalPiano);
        pianos.add(acousticPiano);

        List<MusicalInstrument> trumpets = new ArrayList<>();
        trumpets.add(mendini);
        trumpets.add(jeanPaul);
        trumpets.add(merano);

        ArrayList <MusicalInstrument> instruments = new ArrayList<>();
        instruments.addAll(guitars);
        instruments.addAll(pianos);
        instruments.addAll(trumpets);
//        String instrumentsString = Arrays.toString(instruments);

        System.out.println(instruments + "");
//        System.out.println(bassGuitar + bassGuitar.color + bassGuitar.price + bassGuitar.weight);
//        System.out.println(guitars.get(i).color);
//        System.out.println(instrumentsString);
        System.out.println(instruments.getClass().getSuperclass().getSimpleName());
        System.out.println(instruments.getClass().getSimpleName());
        System.out.println(instruments.getClass().getSuperclass());
        System.out.println(guitars.getClass().getSuperclass().getSimpleName());
        System.out.println(guitars.getClass().getSuperclass().getSimpleName());

    }













}

