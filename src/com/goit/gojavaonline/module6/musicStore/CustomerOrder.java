package com.goit.gojavaonline.module6.musicStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerOrder {

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {
        List<MusicalInstrument> result = new ArrayList<>();
        return result;
    }

    public List<MusicalInstrument> checkAvailabillityOfGoodsInStock(MusicStore store, Map<String, Integer> order) {
        List<MusicalInstrument> result = new ArrayList<>();
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String orderInstrumentType = orderEntry.getKey();
            Integer instrumentQuantity = orderEntry.getValue();
            System.out.println(orderInstrumentType + " " + instrumentQuantity);

            int quantityInStock = 0;
            for (MusicalInstrument instrument : store.getInstruments()) {
                if (instrument.getType().equals(orderInstrumentType) && quantityInStock<instrumentQuantity) {
                    result.add(instrument);
                    quantityInStock++;
                }
            }
            if (quantityInStock < instrumentQuantity) {
                throw new IllegalArgumentException("Как нет стольоко инструментов?!" + orderInstrumentType);            }

        }
        return result;
    }
}