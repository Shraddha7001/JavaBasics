import java.io.*;


public class BufferRead {
    public static void main(String[] args)throws IOException
    {
        

        
        File dir=new File("PW");
        File file1=new File(dir, "pw2.txt");

        FileReader fr1=new FileReader(file1);
        BufferedReader br=new BufferedReader(fr1);


        String line=br.readLine();

        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }

    }
}
