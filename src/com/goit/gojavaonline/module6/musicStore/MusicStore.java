package com.goit.gojavaonline.module6.musicStore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}



    /*@Override
    public String toString () {
        return "MusicStore{" + "guitars=" + guitars.size() + ", pianos=" + pianos.size() +
                ", trumpets=" + trumpets.size() + '}';
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

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


    public static void main(String[] args) {
        MusicStore store = new MusicStore();

        ArrayList<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            guitars.add(new Guitar());
        }
        store.setGuitars(guitars);

        ArrayList<Piano> pianos = new ArrayList<>();
        for (int i = 0; i < 5; i++ ) {
            pianos.add(new Piano());
        }
        store.setPianos(pianos);

        ArrayList<Trumpet> trumpets = new ArrayList<>();
        for (int i =0; i < 15; i++) {
            trumpets.add(new Trumpet());
        }
        store.setTrumpets(trumpets);

        System.out.println(store);

        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 10);
        order.put("piano", 3);
        order.put("trumbet", 7);

        List<MusicalInstrument> guitarToRemove = prepareOrder(store, order);
        //List<MusicalInstrument> pianoToRemove = prepareOrder(store, order);

        System.out.println("removed guitars: " + guitarToRemove.size());
        //System.out.println("removed pianos: " + pianoToRemove.size());

        System.out.println(store);

    }

    public static List<MusicalInstrument> prepareOrder(MusicStore store, Map<String, Integer> order) {
        ArrayList<MusicalInstrument> result = new ArrayList<>();

        List<Guitar> guitars = store.getGuitars();
        int numberOfGuitarsToRemove = order.get("guitar");
        if (store.getGuitars().size() < numberOfGuitarsToRemove) {
            throw new IllegalStateException();
        }
        List<Guitar> guitarsToRemove = store.getGuitars().subList(0, numberOfGuitarsToRemove);
        List<Guitar> guitarsToStay = store.getGuitars().subList(numberOfGuitarsToRemove, guitars.size());
        store.setGuitars(guitarsToStay);
        result.addAll(guitarsToRemove);

        List<Piano> pianos = store.getPianos();
        int numberOfPianosToRemove = order.get("piano");
        if (store.getPianos().size() < numberOfPianosToRemove) {
            throw new IllegalStateException();
        }
        List<Piano> pianosToRemove = store.getPianos().subList(0, numberOfPianosToRemove);
        List<Piano> pianosToStay = store.getPianos().subList(numberOfPianosToRemove, pianos.size());
        store.setPianos(pianosToStay);
        result.addAll(pianosToRemove);

        return result;

//    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order){
//
//      // тут код...
//    }




    }
}





/*
    Map<String, Integer> quantityItems = new HashMap<>();

    public MusicStore(Map<String, Integer> items) {
        this.quantityItems = items;
    }

    public Map<String, Integer> init(String itemName) {
        Map<String,Integer> listOfItems = new HashMap<String,Integer>();
        listOfItems.put("guitar",2);

        return sensorValues;
    }

}


}

*/
/*  Добавить в магазин инструментов метод, который готовит к отгрузке партию музыкальных инструментов согласно заказу.

    Сигнатура метода:
    public List<Instrument> prepareInstruments(Map<String, Integer> order){...}

    В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.

        Ключем в заказе является одна из строк "piano", "guitar", "trumpets"

        Создать свое исключение, которое будет брошено в случае, когда ключ в заказе другой.

        Каким-то образом (самостоятельно выбрать решение) обработать ситуацию, когда количество элементов в заказе отрицательное, нулевое.

        После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
        В случае, когда количество запрашиваемых инструментов определенного типа больше, чем количество доступных инструментов в магазине,
        должно быть брошено исключение. Выбрать наиболее подходящее из доступных в стандартной библиотеке исключений
*/