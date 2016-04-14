package Tests;

import com.goit.gojavaonline.module9.CaesarCipher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

//    @Before
//    CaesarCipher c = new CaesarCipher();

    @Test
    public void testEncrypt() throws Exception {
        String textForEncrypting = "I love coffee, I love tea, " +
                "I love the java jive and it loves me, " +
                "Coffee and tea and the java and me, " +
                "A cup, a cup, a cup, a cup, a cup (boy!) ";

        String actual = CaesarCipher.encrypt(textForEncrypting, 2, 3);
        String expected = "LaNW samWvvss1aLaNW sa,sg1aLaNW sa,BsaHg gaHE sagTpaE,aNW s8aQs1atWvvssagTpa," +
                "sgagTpa,BsaHg gagTpaQs1anam!Z1agam!Z1agam!Z1agam!Z1agam!ZadjWh.da";

        System.out.println(actual);
        System.out.println(expected);


        assertEquals(expected, actual);
    }

    @Test
    public void testDecrypt() throws Exception {
        String textForDecrypting = "LaNW samWvvss1aLaNW sa,sg1aLaNW sa,BsaHg gaHE sagTpaE,aNW s8aQs1atWvvssagTpa," +
                "sgagTpa,BsaHg gagTpaQs1anam!Z1agam!Z1agam!Z1agam!Z1agam!ZadjWh.da";

        String actual = CaesarCipher. decrypt(textForDecrypting,1,6);
        String expected = "I love coffee, I love tea, " +
                "I love the java jive and it loves me, " +
                "Coffee and tea and the java and me, " +
                "A cup, a cup, a cup, a cup, a cup (boy!) ";

       assertEquals("I love coffee, I love tea, " +
               "I love the java jive and it loves me, " +
               "Coffee and tea and the java and me, " +
               "A cup, a cup, a cup, a cup, a cup (boy!) ", actual);

    }
}