import java.util.Arrays;

public class Int_Arr_Process {
    private int[] arr;

    Int_Arr_Process() {
        arr = new int[10];
    }

    Int_Arr_Process(int size) {
        arr = new int[size];
    }

    Int_Arr_Process(int[] arr) {
        this.arr = arr;
    }

    Int_Arr_Process(Int_Arr_Process copy) {
        this.arr = copy.arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void display() {
        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public void sort() {
        Arrays.sort(arr);
        display();
    }

    public void bigSmall() {
        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;

        for (int n : arr) {
            tempMax = Math.max(tempMax, n);
            tempMin = Math.min(tempMin, n);
        }
        System.out.printf("Biggest is %d.\nSmallest is %d.\n",tempMax,tempMin);
    }

    public void sum(){
        int sum = 0;
        for(int n: arr)
            sum+=n;
        System.out.printf("Total is %d.\n", sum);
    }
}
