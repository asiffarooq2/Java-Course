import java.util.Arrays;

class DataSet {
    private double[] values;
    private int size;
    private double total;

    public DataSet() {
        values = new double[100];
        size = 0;
        total = 0;
    }

    public void add(double number) {
        if (size == values.length) {
            System.out.println("DataSet is full!");
            return;
        }

        values[size] = number;
        size++;
        total += number;
    }

    public double getAverage() {
        return (size == 0 ? 0 : total / size);
    }

    // Part (a): Calculate standard deviation
    public double getStandardDeviation() {
        if (size == 0)
            return 0;

        double average = getAverage();
        double squaredSum = 0.0;

        for (int index = 0; index < size; index++) {
            double difference = values[index] - average;
            squaredSum += difference * difference;
        }

        return Math.sqrt(squaredSum / size);
    }

    // Part (b): Calculate average of averages
    public static double calculateAverage(DataSet[] list) {
        double averageSum = 0.0;

        for (DataSet item : list) {
            averageSum += item.getAverage();
        }

        return averageSum / list.length;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "values=" + Arrays.toString(values) +
                ", size=" + size +
                ", total=" + total +
                '}';
    }
}

public class AC3 {
    public static void main(String[] args) {

        // Test Part (a)
        DataSet first = new DataSet();
        first.add(10.0);
        first.add(3.7);
        first.add(4.5);

        System.out.println("Standard Deviation: " + first.getStandardDeviation());

        // Test Part (b)
        DataSet set1 = new DataSet();
        set1.add(20.0);
        set1.add(30.0);
        set1.add(40.0);

        DataSet set2 = new DataSet();
        set2.add(10.0);
        set2.add(20.0);
        set2.add(30.0);

        DataSet set3 = new DataSet();
        set3.add(50.0);
        set3.add(60.0);
        set3.add(70.0);

        DataSet[] collection = {set1, set2, set3};

        System.out.println("Average of Averages: " + DataSet.calculateAverage(collection));
    }
}