package com.goit.gojavaonline.module9;

import com.goit.gojavaonline.module8.musicStore.ListOfInstruments;

public class Main {
    public static void main(String[] args) {
        ListOfInstruments instruments = new ListOfInstruments();
        instruments.makeListOfInstruments();

        System.out.println(instruments.toString());

        new CaesarCipher();

        int m = 3;
        int key= 6;
        String textToEncrypt = instruments.toString();
        String textToDecrypt = CaesarCipher.encrypt(textToEncrypt, m, key);

        System.out.println(CaesarCipher.encrypt(textToEncrypt, m, key));

        System.out.println(CaesarCipher.decrypt(textToDecrypt, m, key));
    }
}

//Реализовать шифрование текста с помощью алгоритма Цезаря.
//Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java