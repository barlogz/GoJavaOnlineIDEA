package Tests;

import com.goit.gojavaonline.module9.CaesarCipher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Before
    public void setUp() throws Exception {
        new CaesarCipher();
    }

    @Rule
    public Timeout timeout = Timeout.seconds(4L);

    @Test
    public void testEncryptionMethod() throws Exception {
        String textForEncrypting = "I love coffee, I love tea, " +
                "I love the java jive and it loves me, " +
                "Coffee and tea and the java and me, " +
                "A cup, a cup, a cup, a cup, a cup (boy!)";

        String actual = CaesarCipher.encrypt(textForEncrypting, 3, 6);
        String expected = "G9NW s9mWvvssR9G9NW s9,sgR9G9NW s9,Bs9Hg g9HE s9gTp9E,9NW s89QsR9oWvvss9gTp9,sg9gTp9,Bs9Hg" +
                " g9gTp9QsR9i9m!ZR9g9m!ZR9g9m!ZR9g9m!ZR9g9m!Z9?jWc0\"";

        System.out.println("  actual: " + actual);
        System.out.println("expected: " + expected);

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testEncryptingMethodForNegativeEncryptionKey() throws Exception {
        String textForEncrypting = "I love coffee";

        CaesarCipher.encrypt(textForEncrypting, 3, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testEncryptingMethodForZeroEncryptionKey() throws Exception {
        String textForEncrypting = "I love coffee";

        CaesarCipher.encrypt(textForEncrypting, 3, 0);
    }

    @Test
    public void testDecryptingMethod() throws Exception {
        String textForDecrypting = "G9NW s9mWvvssR9G9NW s9,sgR9G9NW s9,Bs9Hg g9HE s9gTp9E,9NW s89QsR9oWvvss9gTp9,sg9" +
                "gTp9,Bs9Hg g9gTp9QsR9i9m!ZR9g9m!ZR9g9m!ZR9g9m!ZR9g9m!Z9?jWc0\"";

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
    public void testDecryptingMethodForNegativeEncryptionKey() throws Exception {
        String textForDecrypting = "J?NW s?mWvv";

        CaesarCipher.decrypt(textForDecrypting, -3, -3);
    }

    @Test(expected = RuntimeException.class)
    public void testDecryptingMethodForZeroEncryptionKey() throws Exception {
        String textForDecrypting = "J?NW s?mWvv";

        CaesarCipher.decrypt(textForDecrypting, 3, 0);
    }

    @Test
    public void testEncryptionAndDecryptionTextOfCollection() throws Exception {
        new CaesarCipher();
        String textForEncrypting = "ListOfInstruments[instruments[| Guitar    | Black   |  4     | 10000    |, | " +
                "Guitar    | Red      |  3     | 1800    |, | Guitar    | Woodean   |  2     | 500    |, | Piano   |" +
                " Silver   |  4     | 300    |, | Piano    | White   |  25     | 2000    |, | Piano    | Black   |  " +
                "60     | 4000    |, | Trumpet    | Silver   |  6     | 300    |, | Trumpet    | Gold     |  5     |" +
                " 200    |, | Trumpet    | Blue     |  6     | 99    |]";
        String expected = "PE8,YvGT8,5!QsT,8aET8,5!QsT,8a|9A!E,g59999|9lNgmK999|99w99999|9nkkkk9999|R9|9A!E,g59999" +
                "|97sp999999|99t99999|9nIkk9999|R9|9A!E,g59999|9[WWpsgT999|99q99999|9zkk9999|R9|91EgTW999|9.EN s5999" +
                "|99w99999|9tkk9999|R9|91EgTW9999|9[BE,s999|99qz99999|9qkkk9999|R9|91EgTW9999|9lNgmK999|99Ck99999" +
                "|9wkkk9999|R9|9:5!QZs,9999|9.EN s5999|99C99999|9tkk9999|R9|9:5!QZs,9999|9AWNp99999|99z99999|9qkk9999" +
                "|R9|9:5!QZs,9999|9lN!s99999|99C99999|9LL9999|d";

        String actualEncrypted = CaesarCipher.encrypt(textForEncrypting, 3, 6);
        String actualDecrypted = CaesarCipher.decrypt(expected, 3, 6);

        System.out.println("  actual: " + actualEncrypted);
        System.out.println("expected: " + expected);

        assertEquals(expected, actualEncrypted);
        assertEquals(textForEncrypting, actualDecrypted);
    }
}
