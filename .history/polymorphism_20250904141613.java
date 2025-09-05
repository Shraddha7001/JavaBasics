class Aeroplane{
    public void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane{
    //Overriding
    public void takeoff()
    {
        System.out.println("CargoPlane requires longer size runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane extends Aeroplane{
    //Overriding
    public void takeoff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }

    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane extends Aeroplane{
    public void takeoff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies at high heigth");
    }
}
class Airport{
    public void poly(Aeroplane ref)
    {
        ref.takeoff();
        ref.fly();
        System.out.println("------------------------");
    }
}












public class polymorphism {
    public static void main(String[] args) {
        


        CargoPlane cp=new CargoPlane();
        

        PassengerPlane pp=new PassengerPlane();


        FighterPlane fp=new FighterPlane();


        Airport a=new Airport();
        // ref=cp;
        // ref.takeoff();
        // ref.fly();
        // System.out.println("---------------------------------");
        // ref=pp;
        // ref.takeoff();
        // ref.fly();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

       
    }
}

