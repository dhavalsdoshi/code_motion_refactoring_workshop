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

    @Test
    public void calculatePriceForRoomWith12Beds() throws Exception {
        Room room = new Room(401,12);
        int price = PriceCalculator.calculatePrice(room, 12, 3, false);
        assertEquals(442, price);

        price = PriceCalculator.calculatePrice(room, 10, 2, true);
        assertEquals(270, price);

        price = PriceCalculator.calculatePrice(room, 11, 1, false);
        assertEquals(142, price);

        price = PriceCalculator.calculatePrice(room, 1, 5, false);
        assertEquals(70, price);
    }

}
