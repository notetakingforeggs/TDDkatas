import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


 class kata1Test {
     Kata1 kata1 = new Kata1();
    @Test
        void testSumArray() {

        assertAll(()-> {
            assertEquals(0, kata1.sumArray(new int[]{1}));
            assertEquals(2, kata1.sumArray(new int[]{1, 2, 3}));
            assertEquals(5, kata1.sumArray(new int[]{1, 2, 3, 4}));
            assertEquals(0, kata1.sumArray(new int[]{}));
            assertEquals(3, kata1.sumArray(new int[]{1, 2, 87, -4}));
        });

     }

     @Test
     void testcalcMean(){
        assertEquals(0.0,kata1.calcMean(new int[]{}));
         assertEquals(2.5,kata1.calcMean(new int[]{1,2,3,4}));
     }

     @Test
     void testSumAscii(){
            assertAll(()-> {
                assertEquals(0, kata1.sumAscii(""));
                assertEquals(131, kata1.sumAscii("AB"));
                assertEquals(1195, kata1.sumAscii("northcoders"));
                assertEquals(1163, kata1.sumAscii("Northcoders"));
                assertEquals(100, kata1.sumAscii("13"));
            });
     }
 }