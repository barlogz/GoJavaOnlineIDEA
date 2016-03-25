package com.goit.gojavaonline.module6.musicStore;

public class ExceptionForInstrumentName extends Exception {
    private String type;

    public ExceptionForInstrumentName(String orderInstrumentType) {
        this.type = orderInstrumentType;
    }

    public String getType() {
        return type;
    }
}
