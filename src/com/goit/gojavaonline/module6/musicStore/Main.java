package com.goit.gojavaonline.module6.musicStore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore();

        List<MusicalInstrument> instruments;
        instruments = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 10; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < 25; i++) {
            instruments.add(new Trumpet());
        }
        store.setInstruments(instruments);

        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", 10);
        order.put("Piano", 5);
        order.put("Trumpet", 7);
        System.out.println("Order contains: ");

        try {
            MusicStore.prepareInstruments(store, order);
            MusicStore.removeGoodsFromStock(store, order);

        } catch (Exception e) {
            System.out.println("Exception happened: " + e.getMessage());
        }

        int countGuitars = 0;
        int countPiano = 0;
        int countTrumpet = 0;
        for (MusicalInstrument instrument : instruments) {
            if (instrument.getType().equals("Guitar")) {
                countGuitars++;
            } else if (instrument.getType().equals("Piano")){
                countPiano++;
            } else if (instrument.getType().equals("Trumpet")) {
                countTrumpet++;
            }
        }



        System.out.println("");
        System.out.println("Instruments left in store:");
        System.out.println("Guitar " + countGuitars);
        System.out.println("Piano " + countPiano);
        System.out.println("Trumpet " + countTrumpet);

    }


}



