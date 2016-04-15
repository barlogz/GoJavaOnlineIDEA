package Tests;

import com.goit.gojavaonline.module10.WritingAndReadingFile;
import com.goit.gojavaonline.module9.CaesarCipher;
import org.junit.Test;

import static org.junit.Assert.*;

public class WritingAndReadingFileTest {

    @Test(timeout = 2000)
    public void testWriteFile() throws Exception {
        CaesarCipher caesarCipher = new CaesarCipher();
        String fileName = "output.txt";

        int key = 1;
        String text = "Text which must be encrypted and written to the file.";
        text = CaesarCipher.encrypt(text, 1, key);
        WritingAndReadingFile.write(fileName, text);

        assertEquals("Ufyu\"xijdi\"nvtu\"cf\"fodszqufe\"boe\"xsjuufo\"up\"uif\"gjmf,",
                WritingAndReadingFile.read(fileName));
    }
}
