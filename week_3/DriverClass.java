import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DriverClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numArray = new ArrayList<>();
        try{
            String line;
            while((line=reader.readLine()) != null){
                if(line.equals(""))
                    break;
                int temp = Integer.parseInt(line);
                numArray.add(temp);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        Command_Line1 commandLine1 = new Command_Line1();
        commandLine1.setData(numArray);
        commandLine1.calData();
        commandLine1.displayData();
        System.out.println("===================================");
        KeyRead_Line2 keyReadLine2 = new KeyRead_Line2();
        keyReadLine2.read(numArray);
        keyReadLine2.display();
        keyReadLine2.sort();
        keyReadLine2.find(7);
    }
}
