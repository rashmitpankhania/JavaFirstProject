import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.Stream;

public class Calculator {
    Num_Process add = Integer::sum;
    Num_Process sub = (int a, int b) -> a - b;
    Num_Process multiply = (int a, int b) -> a * b;
    Num_Process divide = (int a, int b) -> a / b;

    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();

        HashMap<Integer, Num_Process> map = new HashMap<>();
        map.put(1,c.add);
        map.put(2,c.sub);
        map.put(3,c.multiply);
        map.put(4,c.divide);

        System.out.println("Enter choice for the operation.\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for  Division");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the two numbers space separated");
        int[] arr;
        String[] s = bufferedReader.readLine().split(" ");
        arr = Stream.of(s).mapToInt(Integer::parseInt).toArray();
        System.out.println(map.get(choice).cal(arr[0],arr[1]));
    }
}
