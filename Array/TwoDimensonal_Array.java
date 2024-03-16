
//Arrays.deepToString() Used To Print The @d Array Object
//Setting Default Values With The Constructor
class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray(int Column, int Row) {
        arr = new int[Column][Row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Value Insertion O(1)
    public void InsertValue2D(int Column, int Row, int Value) {

        try {
            if (arr[Column][Row] == Integer.MIN_VALUE) {
                arr[Column][Row] = Value;
                System.out.println("Value Inserted");

            } else {
                System.out.println("The Is Already Present In This Location");

            }
        } catch (ArrayIndexOutOfBoundsException | ArrayStoreException Aie) {
            System.out.println("The Given Index Is Out Of Range");

        }
    }

    // Acessing Values O(1)
    public void AccessValues(int Column, int Row) {
        try {
            System.out.println("Acessing Values.. . . . ");
            System.out.println("The Value Is =" + " " + arr[Column][Row]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Given Index Is Out Of Range");
        }
    }

    // Array Trversal
    public void PrintArrayValue() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ," + " ");
            }
            System.out.println();
        }

    }
    // Array Search  Linear Search

    public void Search2DArray(int Value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (Value == arr[i][j]) {
                    System.out.println("The Value Is Present In The Array ");
                    return;
                }
            }

            

        }
        System.out.println("The Given Value Is Not Present");

    }
    public void DeleteValue2D(int Column, int Row) {

        try {

                arr[Column][Row] = Integer.MIN_VALUE;
                System.out.println("Value Deleted");
        
        } catch (ArrayIndexOutOfBoundsException Aie) {
            System.out.println("The Given Index Is Out Of Range");

        }
    }

}
