package com.goit.gojavaonline.module6.musicStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore();

        List<MusicalInstrument> instruments = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 10; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < 15; i++) {
            instruments.add(new Trumpet());
        }
        store.setInstruments(instruments);

        System.out.println(store);


        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", 5);
        order.put("Piano", 99);
        order.put("Trumpet", 12);

        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.checkAvailabillityOfGoodsInStock(store, order);

    }


}
