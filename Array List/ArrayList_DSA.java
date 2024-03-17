import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_DSA {
   public static void main(String[] args) {
    
    ArrayList<Integer> IntArray=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    IntArray.add(122);
    IntArray.add(1225);// To Add Value At The End
    IntArray.add(15522);
    IntArray.add(122);
    IntArray.add(122);
    IntArray.add(5,5555555);     //To Add Or Change The Value At An Particular Index
    System.out.println(IntArray);
    IntArray.remove(Integer.valueOf(122));
    System.out.println(IntArray);
   } 
}
