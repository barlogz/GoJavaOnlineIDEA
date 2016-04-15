package com.goit.gojavaonline.module9;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {

    static List<Character> alphabet = new ArrayList<>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-', ' ', '"', '(', ')', '|', '[', ']'};

    {

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
    }

    public static String encrypt(String text, int m, int k) {
        try {
            if (m <= 0 || k < 0) {
                throw new IllegalArgumentException("Введено нулевое или отрицательное значение. Введите значение больше \"" + "0" + "\"");
            }
            if (k == 0) {
                throw new IllegalArgumentException("Введено нулевое значение ключа. Ваш текст не будет зашифрован");
            }

            int n = alphabet.size();
            m = m % n;
            k = k % n;
            if (gcd(n, m) != 1) {//проверка простоты n относительно m
                return null;
            }
            StringBuilder encryptedText = new StringBuilder();
            //блок шифрования данных
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                int index = alphabet.indexOf(c);
                index = (index * m + k) % n;
                encryptedText.append(alphabet.get(index));
            }
            return encryptedText.toString();

        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static String decrypt(String text, int m, int k) {
        try {
            if (m <= 0 || k < 0) {
                throw new IllegalArgumentException("Введено нулевое или отрицательное значение. Введите значение больше \"" + "0" + "\"");
            }
            if (k == 0) {
                throw new IllegalArgumentException("Введено нулевое значение ключа. Ваш текст не будет зашифрован");
            }

            int n = alphabet.size();
            m = m % n;
            k = k % n;
            int reversedM = -1;//обратное к m

            for (int i = 0; i < n; i++) {
                if ((i * m) % n == 1) {
                    reversedM = i;
                    break;
                }
            }
            StringBuilder decryptedText = new StringBuilder();
            //блок дешифрования данных
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                int index = alphabet.indexOf(c);
                index = (((index - k) * reversedM) % n + n) % n;
                decryptedText.append(alphabet.get(index));
            }
            return decryptedText.toString();

        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    //алгоритм поиска наибольшего общего делителя
    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}

