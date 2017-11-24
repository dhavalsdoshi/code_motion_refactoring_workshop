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
}
