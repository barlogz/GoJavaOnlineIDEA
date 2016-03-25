package com.goit.gojavaonline.module6.musicStore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore();

        List<MusicalInstrument> instruments = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 3; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < 5; i++) {
            instruments.add(new Trumpet());
        }
        store.setInstruments(instruments);

        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", 3);
        order.put("Piano", 2);
        order.put("Trumpet", 2);
        System.out.println("Order contains: ");

        try {
            MusicStore.prepareInstruments(store, order);
            MusicStore.removeGoodsFromStock(store, order);

        } catch (Exception e) {
            System.out.println("Exception happened: " + e.getMessage());
        }

        instruments.forEach(System.out::println);
    }


}



