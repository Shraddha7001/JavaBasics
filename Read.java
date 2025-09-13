import java.io.*;


public class Read {
    public static void main(String[] args) throws IOException
    {
        

        File dir=new File("PW");
        File file=new File(dir, "pw.txt");

        FileReader fr=new FileReader(file);


        //read method is called again and again
        // int i=fd.read();
        // // System.out.println((char)i);

        // while(i!=-1)
        // {
        //     System.out.print(i+"---------->");
        //     System.out.println((char)i);
        //     i=fd.read();

        



        char ch[]=new char[(int)file.length()];
        fr.read(ch);

        for(char data:ch)
        {
            System.out.print(data);
        }

    }
}
