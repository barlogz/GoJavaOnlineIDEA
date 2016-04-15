package com.goit.gojavaonline.module10;

import com.goit.gojavaonline.module9.CaesarCipher;

import java.io.*;
import java.util.Scanner;

public class WritingAndReadingFile {
    public static void main(String[] args) throws IOException {
        try {
            CaesarCipher caesarCipher = new CaesarCipher();
            Scanner scanner = new Scanner(System.in);

            String textForWritingToFile = "Text which must be encrypted and written to the file.";
            System.out.println("This is the text message to be written to the file: \n" + textForWritingToFile + "\n");

            System.out.println("Please, enter the key for encryption (from 1 to 100):");
            int key = scanner.nextInt();

            textForWritingToFile = CaesarCipher.encrypt(textForWritingToFile, 1, key);
            write("output.txt", textForWritingToFile);

            System.out.println("Recorded ciphered text");
            System.out.println(read("output.txt"));

            String textFromFile = CaesarCipher.decrypt((read("output.txt")), 1, key);
            System.out.println("Decrypted text from file: \n" + textFromFile);
        } catch (IOException | RuntimeException ex) {
            System.err.println("|ERROR| key was entered in wrong format!");
        }
    }

    public static void write(String fileName, String text) {
        File file = new File(fileName);

        try (PrintWriter printOut = new PrintWriter(file.getAbsoluteFile())) {
            printOut.write(text);
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(fileName);
        exists(fileName);

        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                String s;
                while ((s = reader.readLine()) != null) {
                    stringBuilder.append(s);
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return stringBuilder.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}