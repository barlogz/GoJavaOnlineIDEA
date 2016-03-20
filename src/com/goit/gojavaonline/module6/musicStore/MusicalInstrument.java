package com.goit.gojavaonline.module6.musicStore;

public abstract class MusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{" + getType() + "}";
    }
}
