import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by andrew on 9/24/15.
 */
public class EntryClassTest {

    @Test
    public void simpleNumberAddition() {

        EntryClass entryClass = new EntryClass();
        int testnumber1 = 5, testnumber2 = 5;
        int expectedResult = 10;
        int actualResult = entryClass.addNumbers(testnumber1,testnumber2);
        assertEquals(expectedResult,actualResult,"Number addition does not work properly");
    }
}