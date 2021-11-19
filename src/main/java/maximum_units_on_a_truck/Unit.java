package maximum_units_on_a_truck;

public class Unit {
    private int boxCount;
    private Box box;

    public Unit(int boxCount, Box box) {
        this.boxCount = boxCount;
        this.box = box;
    }

    public int getBoxCount() {
        return boxCount;
    }

    public Box getBox() {
        return box;
    }
}
