package array;
import array.SingleDimensionArray;

public class SingleDimensionArrayMain {

    public static void main(String[] args) {
        
        System.out.println("Creating a blank array of size 10...");
        SingleDimensionArray sda = new SingleDimensionArray(10);

        System.out.println("Printing the Array...");
        sda.traverseArray();

        System.out.println();
        System.out.println();

        System.out.println("Inserting few values in the array...");
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(3,30);
        sda.insert(4,40);
        sda.insert(5,50);
        sda.insert(6,60);
        sda.insert(7,70);
        sda.insert(8,80);
        sda.insert(1,100);
        sda.insert(12,120);

        System.out.println();
        System.out.println();

        System.out.println("Accessing cell number #1");
        sda.accessingCell(1);

        System.out.println();
        System.out.println();

        System.out.println("Searching for 400 in the array...");
        sda.searchInAnArray(400);
        System.out.println("Searching for 40 in the array...");
        sda.searchInAnArray(40);

        System.out.println();
        System.out.println();

        System.out.println("Deleting cell number #3");
        System.out.println("Before deleting:");
        sda.traverseArray();
        sda.deleteValueFromArray(3);
        System.out.println("After deleting:");
        sda.traverseArray();
        
        System.out.println();
        System.out.println();



    }

}