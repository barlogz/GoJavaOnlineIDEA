package com.goit.gojavaonline.module6.musicStore;

public class ExceptionForInstrumentName extends Exception {
    private String orderInstrumentType;

    public ExceptionForInstrumentName(String orderInstrumentType) {
        this.orderInstrumentType = orderInstrumentType;
    }

    public String getOrderInstrumentType() {
        return orderInstrumentType;
    }
}
