//Wrote by Jiaming Li
import java.io.*;
import java.sql.Timestamp;
public class Homework {

    public static int sumToX(int x) {
        //This is the function to sum of 1 to x
        //Use the parameter x to do something reasonable, I use parameter x to sum up from 1 to x
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        //↓ for sumToX
        int x = 4;
        int result = sumToX(x);
        System.out.println(result);
        // -----------------------------
        //Print current timestamp
        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        System.out.println("Time stamp:"+timestamp);

        //Create a file name x   Example: "x.txt"
        File file = new File("x.txt");
        FileWriter fw = new FileWriter(file);

        //loop x times to display something;
        for (int i = 0; i < x; i++) {
            System.out.println("Hello World!!");
        }
    }
}
