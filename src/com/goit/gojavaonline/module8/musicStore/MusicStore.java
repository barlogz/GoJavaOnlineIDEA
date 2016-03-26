package com.goit.gojavaonline.module8.musicStore;

        import java.util.List;

public class MusicStore {
    private List<Guitar> guitars;
    private List<Trumpet> trumpets;
    private List<Piano> pianos;

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }
}

