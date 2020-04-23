import java.util.ArrayList;
import java.util.Collections;

public class Command_Line1 {
    private ArrayList<Integer> num_array;

    private int sum,avg, biggest,smallest;

    public void setData(ArrayList<Integer> num_array) {
        this.num_array = num_array;
    }

    public void calData(){
        // sum
        for(int n: num_array)
            this.sum+=n;

        // avg
        this.avg = this.sum/num_array.size();

        // biggest
        this.biggest = Collections.max(num_array);

        // smallest
        this.smallest = Collections.min(num_array);
    }

    public void displayData(){
        System.out.printf("Sum: %d\nAverage: %d\nBiggest: %d\nSmallest: %d\n", sum,avg, biggest,smallest);
    }
}
