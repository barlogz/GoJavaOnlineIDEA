package Tests;

import com.goit.gojavaonline.module9.CaesarCipher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Before
    public void setUp() throws Exception {
        CaesarCipher c = new CaesarCipher();

    }

    @Test
    public void testEncryptingMethod() throws Exception {
        String textForEncrypting = "I love coffee, I love tea, " +
                "I love the java jive and it loves me, " +
                "Coffee and tea and the java and me, " +
                "A cup, a cup, a cup, a cup, a cup (boy!)";

        String actual = CaesarCipher.encrypt(textForEncrypting, 3, 6);
        String expected = "J?NW s?mWvvssX?J?NW s?,sgX?J?NW s?,Bs?Hg g?HE s?gTp?E,?NW s8?QsX?rWvvss?gTp?,sg?gTp?,Bs?Hg" +
                " g?gTp?QsX?l?m!ZX?g?m!ZX?g?m!ZX?g?m!ZX?g?m!Z?ajWf6d";

        System.out.println("  actual: " + actual);
        System.out.println("expected: " + expected);


        assertEquals(expected, actual);
    }

    @Test
    public void testDecryptingMethod() throws Exception {
        String textForDecrypting = "J?NW s?mWvvssX?J?NW s?,sgX?J?NW s?,Bs?Hg g?HE s?gTp?E,?NW s8?QsX?rWvvss?gTp?,sg?gTp?,Bs?Hg" +
                " g?gTp?QsX?l?m!ZX?g?m!ZX?g?m!ZX?g?m!ZX?g?m!Z?ajWf6d";

        String actual = CaesarCipher.decrypt(textForDecrypting, 3, 6);
        String expected = "I love coffee, I love tea, " +
                "I love the java jive and it loves me, " +
                "Coffee and tea and the java and me, " +
                "A cup, a cup, a cup, a cup, a cup (boy!)";

        assertEquals(expected, actual);

        System.out.println("\n" + "  actual: " + actual);
        System.out.println("expected: " + expected);
    }

    @Test(expected = RuntimeException.class)
    public void testEncryptingMethod2() throws Exception {
        String textForEncrypting = "J?NW s?mWvvssX?J?NW s?,sgX?J?NW s?,Bs?Hg g?HE s?gTp?E,?NW s8?QsX?rWvvss?gTp?,sg?gTp?,Bs?Hg" +
                " g?gTp?QsX?l?m!ZX?g?m!ZX?g?m!ZX?g?m!ZX?g?m!Z?ajWf6d";

        CaesarCipher.encrypt(textForEncrypting, 3, 0);

    }
}