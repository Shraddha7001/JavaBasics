import java.io.*;

public class PrintWrite{

    public static void main(String[] args) throws IOException
    {
        
        File dir=new File("PW");
        File file2=new File(dir, "pw3.txt");

        FileWriter fw2=new FileWriter(file2);
        PrintWriter pw=new PrintWriter(fw2);


        pw.println("Asansol");
        pw.println("Ramgad");
        pw.println("Hazaribagh");
        pw.println("Kolkata");
        pw.println("Katrasghar");
        pw.println("Kolkata");

        pw.close();


    }
}