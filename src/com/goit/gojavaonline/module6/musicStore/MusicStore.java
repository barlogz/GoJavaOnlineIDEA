package com.goit.gojavaonline.module6.musicStore;


import java.util.*;

public class MusicStore {
    private List<MusicalInstrument> instruments;

    public List<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<MusicalInstrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public String toString() {
        return "MusicStore{" +
                "instruments=" + instruments +
                '}';
    }

    public static List<MusicalInstrument> prepareInstruments(MusicStore store, Map<String, Integer> order) {
        List<MusicalInstrument> result = new ArrayList<>();
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String orderInstrumentType = orderEntry.getKey();
            Integer instrumentQuantity = orderEntry.getValue();

            System.out.println(orderInstrumentType + " " + instrumentQuantity);

            int quantityInStock = 0;
            for (MusicalInstrument instrument : store.getInstruments()) {
                if (instrument.getType().equals(orderInstrumentType) && quantityInStock < instrumentQuantity) {
                    result.add(instrument);
                    quantityInStock++;
                }
            }
            if (quantityInStock < instrumentQuantity) {
                        throw new IllegalArgumentException("Ваш заказ не може быть выполнен. " +
                                "Нет таких товаров в таком количестве." + orderInstrumentType);

            }
        }
        return result;

    }




    public static void removeGoodsFromStock(MusicStore store, Map<String, Integer> order) {
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String orderInstrumentType = orderEntry.getKey();
            Integer instrumentsQuantity = orderEntry.getValue();
            int numberInstrumentRemoved = 0;
            Iterator<MusicalInstrument> iterator = store.getInstruments().iterator();
            while (iterator.hasNext()) {
                MusicalInstrument instrument = iterator.next();
                if (instrument.getType().equals(orderInstrumentType) && numberInstrumentRemoved < instrumentsQuantity) {
                    iterator.remove();
                    numberInstrumentRemoved++;

                }
            }

        }
    }
}

