public class PriceCalculator {

    public static int calculatePrice(Room r, int p, int days, boolean fullRoom) {
        int price = 0;
        price = p * 20 * days + 10;

        if (fullRoom) {
            price = price + (r.getBeds() - p) * 10 * days;
        }
        if (p > r.getBeds()) {
            return -1;
        }
        return price;
    }
}
