
// import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;





class Cricketer implements Serializable{
    private String name;
    private int age;
    private int runs;



    public Cricketer(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;

    }


    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}


public class bytecodeTOcode {
    public static void main(String[] args) throws Exception
    {
        

        Cricketer cr=new Cricketer("Virat kholi", 35, 2000);

        FileInputStream fis=new FileInputStream("pw.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);


        cr.disp();;

        
    }
}
