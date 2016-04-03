package com.goit.gojavaonline.module10;

import com.goit.gojavaonline.module9.CaesarCipher;
import java.io.*;

public class WritingAndReadingFile {
    public static void main(String[] args) throws IOException {
        try {
            CaesarCipher caesarCipher = new CaesarCipher();

            String textForWritingToFile = "Text which must be encrypted and written to the file.";
            System.out.println("Text message to be written to the file: \n" + textForWritingToFile + "\n");

            textForWritingToFile = caesarCipher.encrypt(textForWritingToFile, 3, 6);
            write("output.txt", textForWritingToFile);

            System.out.println("Recorded ciphertext");
            System.out.println(read("output.txt"));

            String textFromFile = caesarCipher.decrypt((read("output.txt")), 3, 6);
            System.out.println("Decrypted text from file: \n" + textFromFile);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void write(String fileName, String text) {
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            try (PrintWriter printOut = new PrintWriter(file.getAbsoluteFile())) {
                printOut.write(text);
            }
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
