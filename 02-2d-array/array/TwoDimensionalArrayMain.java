package array;
import array.TwoDimensionalArray;

public class TwoDimensionalArrayMain {

    public static void main(String[] args) {

        System.out.println("Creating a blank array of size 5x5");
        TwoDimensionalArray sda = new TwoDimensionalArray(5,5);
        sda.traverseArray();

        sda.insertValueInArray(0,2, 10000001);
        sda.traverseArray();
        sda.insertValueInArray(0,2, 10000001);
        sda.traverseArray();

        sda.accessCell(0,2);
        sda.accessCell(6,2);
        sda.accessCell(2,2);

        sda.searchValue(10);
        sda.searchValue(Integer.MIN_VALUE);
        sda.searchValue(10000001);

        sda.deleteValue(0,2);
        sda.traverseArray();

        sda.deleteArray();
        sda.traverseArray();

    }

}