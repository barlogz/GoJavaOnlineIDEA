package com.goit.gojavaonline.module8.musicStore;

public abstract class MusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{" + getType() + "}";
    }
}
