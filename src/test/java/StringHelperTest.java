
import org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
@RunWith(Parameterized.class)
public class StringHelperTest {

    private String expected;
    private String actual;

    public StringHelperTest(String expected, String actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection parameterizedTest(){
        String[][] t={{"CD","AACD"},{"CD","ACD"}};
        return Arrays.asList(t );
    }

    @Test
    public void truncateAInFirst2PositionsTest() {
       StringHelper stringHelper=new StringHelper();
        assertEquals(expected, stringHelper.truncateAInFirst2Positions(actual));

    }



}
