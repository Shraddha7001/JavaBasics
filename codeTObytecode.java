// import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
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
}


public class codeTObytecode {
    public static void main(String[] args) throws Exception
    {
        

        Cricketer c=new Cricketer("Virat kholi", 35, 2000);

        FileOutputStream fos=new FileOutputStream("pw.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);


        oos.writeObject(c);
        oos.flush();
        oos.close();

        
    }
}
