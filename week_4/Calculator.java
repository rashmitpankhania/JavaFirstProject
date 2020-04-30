public class Calculator {
    Num_Process add = Integer::sum;
    Num_Process sub = (int a, int b) -> a - b;
    Num_Process multiply = (int a, int b) -> a * b;
    Num_Process divide = (int a, int b) -> a / b;

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add.cal(3,4);
    }
}
