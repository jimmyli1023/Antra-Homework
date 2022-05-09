import java.io.BufferedReader;
import java.io.*;

public class TxtRead {
    public static String txtToString(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(String[] args){
        File file = new File("C:\\Users\\Administrator\\Desktop\\CountFiles\\Assignment4\\input.txt");
        System.out.println(txtToString(file));
    }
}
