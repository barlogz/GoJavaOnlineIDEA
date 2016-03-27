package com.goit.gojavaonline.module8.musicStore;

import java.util.Comparator;

public class InstrumentPriceComparator implements Comparator<MusicalInstrument> {
    @Override
    public int compare(MusicalInstrument instrument1, MusicalInstrument instrument2) {

        int price1 = instrument1.getPrice();
        int price2 = instrument2.getPrice();

	   /*For ascending order*/
        return price1 - price2;
       /*For descending order*/
        //price2-price1;
    }
}








