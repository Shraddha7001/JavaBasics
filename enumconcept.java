public class enumconcept {



    enum Week
    {
        MON,TUE,WED,THU,FRI,SAT,SUN;
    }
    public static void main(String[] args) {


        enum Result
        {
            PASS,FAIL,NR;
        }
        
        Week w=Week.MON;
        System.out.println(w);


        Result r=Result.PASS;
        System.out.println(r);
        

    }
}
