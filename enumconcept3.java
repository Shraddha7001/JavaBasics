enum Result
{
    PASS,FAIL,NR;
}

public class enumconcept3 {
    public static void main(String[] args) {
        

        Result res=Result.PASS;


        switch(res)
        {
            case PASS: System.out.println("PASSED....!!!!");
            break;
            case FAIL: System.out.println("FAILED....!!!");
            break;
            case NR: System.out.println("No Result....!!!");
        }
    }
}
