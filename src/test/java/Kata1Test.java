import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


 class kata1Test { Kata1 kata1 = new Kata1();
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
 }