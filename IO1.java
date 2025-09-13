import java.io.*;

public class IO1{

    public static void main(String[] args) throws IOException
    {
        

        File file1=new File("pw1.txt");
        System.out.println(file1.exists());

        file1.createNewFile();
        System.out.println(file1.exists());




        File dir1=new File("Pw");
        System.out.println(dir1.exists());

        dir1.mkdir();
        System.out.println(dir1.exists());


        File dir2=new File("PWJAVA");
        System.out.println(dir2.isDirectory());
        dir2.mkdir();


        File file2=new File(dir2,"pwskills.txt");
        file2.createNewFile();
        System.out.println(file2.isFile());



        int count=0;
        File f=new File("PWJAVA");
        String str[]=f.list();

        for(String name:str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println(count);




        int count1=0;
        File f1=new File("D:\\JavaBasics");
        String str1[]=f1.list();

        for(String name1:str1)
        {
            count1++;
            System.out.println(name1);
        }
        System.out.println(count1);



    }
}