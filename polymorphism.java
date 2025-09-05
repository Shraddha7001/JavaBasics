class Aeroplane1{
    public void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane1 extends Aeroplane1{
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
class PassengerPlane1 extends Aeroplane1{
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
class FighterPlane1 extends Aeroplane1{
    //overriding
    public void takeoff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies at high heigth");
    }
}













public class polymorphism {
    public static void main(String[] args) {
        


        CargoPlane1 cp1=new CargoPlane1();
        

        PassengerPlane1 pp1=new PassengerPlane1();


        FighterPlane1 fp1=new FighterPlane1();


        Aeroplane1 ref1;
        ref1=cp1;
        ref1.takeoff();
        ref1.fly();
        System.out.println("---------------------------------");
        ref1=pp1;
        ref1.takeoff();
        ref1.fly();
        System.out.println("----------------------");
        ref1=fp1;
        ref1.takeoff();
        ref1.fly();
        

       
    }
}

