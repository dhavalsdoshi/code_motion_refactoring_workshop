import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void calculatePriceForRoomWith4Beds() throws Exception {
        Room room = new Room(401,4);
        int price = PriceCalculator.calculatePrice(room, 4, 3, false);
        assertEquals(250, price);

        price = PriceCalculator.calculatePrice(room, 4, 3, true);
        assertEquals(250, price);

        price = PriceCalculator.calculatePrice(room, 3, 3, false);
        assertEquals(190, price);

        price = PriceCalculator.calculatePrice(room, 2, 3, true);
        assertEquals(190, price);
    }

    @Ignore("Waiting to be implemented")
    @Test
    public void calculatePriceForRoomWith8Beds() throws Exception {
        Room room = new Room(401,8);
        int price = PriceCalculator.calculatePrice(room, 8, 3, false);
        assertEquals(370, price);

        price = PriceCalculator.calculatePrice(room, 6, 2, true);
        assertEquals(210, price);

        price = PriceCalculator.calculatePrice(room, 3, 5, false);
        assertEquals(235, price);

        price = PriceCalculator.calculatePrice(room, 1, 1, false);
        assertEquals(25, price);
    }

}
