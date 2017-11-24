
public class Room {
    private final int number;
    private final int beds;

    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }

    public int getNumber() {
        return number;
    }
}
