import java.io.*;

public class Write{
    public static void main(String[] args)throws IOException
     {
        


        File dir=new File("PW");
        File file=new File(dir, "pw.txt");


        FileWriter fw=new FileWriter(file);

        fw.write("Rohit Soni");
        fw.write("\n");
        fw.write("Kishan Verma");
        fw.write("\n");
        fw.write("Shubham Singh");
        fw.write("\n");
        fw.write("Shraddha Yadav");
        fw.write("\n");
        fw.write("Ayush Jha");
        fw.write("\n");
        fw.write("Raj Kumar Chandra");


        fw.close();
        //fw.flush

        System.out.println("Open pw.txt to see result");
    }
}