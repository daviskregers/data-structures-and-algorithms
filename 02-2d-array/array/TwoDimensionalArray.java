package array;

public class TwoDimensionalArray {

    int arr[][] = null;

    // Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns)
    {
        this.arr = new int[numberOfRows][numberOfColumns];
        for( int row = 0; row < arr.length; row++) {
            for( int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Traverse array
    public void traverseArray() 
    {
        try {

            System.out.println("Printing the array now...");

            for(int row = 0; row < arr.length; row++) {
                for(int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
        } catch ( Exception e ) {
            System.out.println("Array does not exist");
        }
    }

    // Insert value
    public void insertValueInArray(int row, int col, int value)
    {
        try {
            if(arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted " + value + " in the array");
            } else {
                System.out.println("This cell is already occupied by another value");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    // access cell
    public void accessCell(int row, int col) 
    {
        System.out.println("\nAccessing row " + row +", col " + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    // search value
    public void searchValue(int value) 
    {

        System.out.println("\n Searching for value " + value);
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == value) {
                    System.out.println("Value has been found at location [" + row + "][" + col + "]" );
                    return;
                }
            }
        }

        System.out.println("The value was not found");

    }

    // delete value
    public void deleteValue(int row, int col) 
    {
        System.out.println("Deleting value from row " + row + ", col " + col);
        
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }

    }

    // delete entire array
    public void deleteArray()
    {
        arr = null;
        System.out.println("Array has been deleted");
    }



}