enum Result
{
    PASS,FAIL,NR;



    int Marks;

    Result()
    {
        System.out.println("Constructor in Enum");
    }

    void setMarks(int Marks)
    {
        this.Marks=Marks;
    }

    int getMarks()
    {
        return Marks;
    }
}



public class enumconcept2 {
    public static void main(String[] args) {
        

        Result.PASS.setMarks(80);

        int m1=Result.PASS.getMarks();
        System.out.println(m1);


        int m2=Result.FAIL.getMarks();
        System.out.println(m2);


        Result.NR.setMarks(45);
        int m3=Result.NR.getMarks();
        System.out.println(m3);
    }
}
