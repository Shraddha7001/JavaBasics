import java.io.*;

public class BufferWrite {
    public static void main(String[] args) throws IOException
    {
        


        File dir=new File("PW");
        File file1=new File(dir, "pw2.txt");


        FileWriter fw1=new FileWriter(file1);
        BufferedWriter bw=new BufferedWriter(fw1);


        bw.write("Except 5, all of them are Engineering Students");
        bw.newLine();
        bw.write("5 number is a CA aspirant");
        bw.newLine();
        bw.write("Except 2, rest will be going to graduate in 2026");
        bw.newLine();
        bw.write("2 number is going to graduate in 2027");
        bw.newLine();


        bw.close();

    }
}
