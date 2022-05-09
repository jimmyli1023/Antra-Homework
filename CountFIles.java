import java.io.File;
public class CountFIles {
    public static void main(String[] args){
        int w=0;//numbers of files
        int m=0;//numbers of folders
        File file = new File("C:\\Users\\Administrator\\Desktop\\CountFiles");
        if(file.isDirectory()) {
            String []str = file.list();
            for(String i:str) {
                File file1 = new File("C:\\Users\\Administrator\\Desktop\\CountFiles"+i);
                if(file1.isFile()) {
                    w=w+1;
                }
                if(file1.isDirectory()) {
                    m+=1;
                }
                System.out.println(i);
            }
            int sum = w+m;
            System.out.println("Total Files including folders "+sum);
            System.out.println("Total Folders "+m);
            System.out.println("Total Files excluding folders "+w);
        }else {
            System.out.println("The folder does not exist! ");
        }
    }
}