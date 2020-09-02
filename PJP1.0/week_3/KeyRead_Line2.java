import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KeyRead_Line2 {
    private ArrayList<Integer> num_array;

    public void read(ArrayList<Integer> num_array){
        this.num_array = num_array;
    }

    public void display(){
        System.out.println(num_array);
    }

    public void sort(){
        Collections.sort(num_array);
        System.out.println(num_array);
    }

    public void find(int key){
        int temp =  Collections.binarySearch(num_array, key);
        System.out.printf("Found %d\n" , temp);
    }


}
