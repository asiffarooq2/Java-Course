class SingleTable {
    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int seats, int height, double quality) {
        numSeats = seats;
        this.height = height;
        viewQuality = quality;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        viewQuality = value;
    }
}

class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        table1 = t1;
        table2 = t2;
    }

    // Returns true if the combined table can seat numPeople
    public boolean canSeat(int numPeople) {
        return numPeople <= table1.getNumSeats() + table2.getNumSeats() - 2;
    }

    // Returns the desirability of the combined table
    public double getDesirability() {
        double average = (table1.getViewQuality() + table2.getViewQuality()) / 2.0;

        if (table1.getHeight() == table2.getHeight()) {
            return average;
        } else {
            return average - 10.0;
        }
    }
}

public class CombinedTableTest {

    public static void main(String[] args) {

        // Create SingleTable objects
        SingleTable t1 = new SingleTable(4, 74, 60.0);
        SingleTable t2 = new SingleTable(8, 74, 70.0);
        SingleTable t3 = new SingleTable(12, 76, 75.0);

        // Combined Table c1
        CombinedTable c1 = new CombinedTable(t1, t2);

        System.out.println("Can c1 seat 9 people? " + c1.canSeat(9));
        System.out.println("Can c1 seat 11 people? " + c1.canSeat(11));
        System.out.println("c1 Desirability: " + c1.getDesirability());

        System.out.println();

        // Combined Table c2
        CombinedTable c2 = new CombinedTable(t2, t3);

        System.out.println("Can c2 seat 18 people? " + c2.canSeat(18));
        System.out.println("c2 Desirability: " + c2.getDesirability());

        System.out.println();

        // Change view quality of t2
        t2.setViewQuality(80.0);

        System.out.println("After changing t2 view quality:");
        System.out.println("c2 Desirability: " + c2.getDesirability());
    }
}
