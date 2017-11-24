public class BillingSystem {
    public static void main(String[] args) {
        Room r1 = new Room(412, 4);

        int i = PriceCalculator.calculatePrice(r1, 3, 6, true);

        if(i < 0 ) {
            System.out.println("Error");
        }
        else{
            System.out.println("Total price = " + i);
        }
    }
}
