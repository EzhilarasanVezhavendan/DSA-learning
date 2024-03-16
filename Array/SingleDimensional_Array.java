//Arrays.toString(Sd.arr) used to Convert the array object to visible value
public class SingleDimensional_Array {
    int arr[] = null;

    public SingleDimensional_Array(int val) {
        arr = new int[val];
        for (int i = 0; i < val; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void InsertValue(int location, int inVal) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = inVal;
                System.out.println("Succesfully Inserted");
            } else {
                System.out.println("Value Is Already existing");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given Index Is Out Of Range");
        }
    }

    public void GetArrayValue(int location) {

        try {
            System.out.println(arr[location]);

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given Index Is Out Of Range");
        }

    }

    public void DeleteValue(int location, int inVal) {
        try {
                arr[location] = Integer.MIN_VALUE;
                System.out.println("Deleted Sucessfully");
            } 
            
         catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given Index Is Out Of Range");
        }
    }
    // linear Search
    

    public void LinearSearchValue(int value) {
    
        int i, j = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("The Value Is Present In The Array:");
               return;

            }

        }
        System.out.println("THe Value Is Not Present:");
    

   
}
}
