import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/**
 * Created by Des
 * on 29.05.2017.
 */
public class TestNGExample {

    @DataProvider(name="ABCdata")
    private Object[][] data(){
        return  new Object[][]{
                {1,4,4, new float[]{-2}}, //
                {1,5,6, new float[]{-2, -3}}, //
                {1,0, -4, new float[]{ 2, -2}}, //

        };
    }

    @Test(dataProvider = "ABCdata")
    public void testFindRoots(float A, float B, float C, float[] D) throws QuaderExeption {
        Quadr quadr = new  Quadr(A,B,C);
        assertArrayEquals( quadr.roots(),D, (float) 0.0001);
        //assertTrue(1==1);
    }

}
