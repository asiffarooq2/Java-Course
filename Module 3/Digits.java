import java.util.ArrayList;

class Digits {
    private ArrayList<Integer> digitList;

    // Constructor
    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    // Method to display the digits
    public void displayDigits() {
        System.out.println(digitList);
    }

    public static void Main3(String[] args) {
        Digits d1 = new Digits(15704);
        d1.displayDigits();

        Digits d2 = new Digits(0);
        d2.displayDigits();

        Digits d3 = new Digits(98765);
        d3.displayDigits();
    }
}