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

        List<MusicalInstrument> guitars = new ArrayList<>();
        guitars.add(bassGuitar);
        guitars.add(electricGuitar);
        guitars.add(acousticGuitar);

        Piano synthesizers = new Piano("Silver", 4, 300);
        Piano digitalPiano = new Piano("White", 25, 2000);
        Piano acousticPiano = new Piano("Black", 60, 4000);

        Trumpet mendini = new Trumpet("Silver", 6, 300);
        Trumpet jeanPaul = new Trumpet("Gold", 5, 200);
        Trumpet merano = new Trumpet("Blue", 6, 99);



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

        System.out.println(instruments.get(price));
//        System.out.println(bassGuitar + bassGuitar.color + bassGuitar.price + bassGuitar.weight);
//        System.out.println(guitars.get(i).color);

        public void print() {
//            CollectionList collectionList = new CollectionList();
//            collectionList.makeCollectionList();
            System.out.println("collectionList.size()=" + collectionList.collectionList.size());
            //new GFrame();
            System.out.println(collectionList.getCollection().get(0).filesName);
            System.out.println("------------------------------------------------------");
            System.out.println("|Super   |  Object      | Object    |Object | Object |");
            System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
            System.out.println("------------------------------------------------------");

            for (int n = 0; n < collectionList.getCollection().size(); n++) {
                Object o = collectionList.getCollection().get(n);


                System.out.println(o);
            }
            System.out.println("------------------------------------------------------");

        }


    }













}

