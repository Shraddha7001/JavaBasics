abstract class Aeroplane2{
    abstract public void takeoff();
    
    abstract public void fly();
    
}
class CargoPlane2 extends Aeroplane2{
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
class PassengerPlane2 extends Aeroplane2{
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
class FighterPlane2 extends Aeroplane2{
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
    public void poly(Aeroplane2 ref)
    {
        ref.takeoff();
        ref.fly();
        System.out.println("------------------------");
    }
}












public class abstractClass {
    public static void main(String[] args) {
        


        Aeroplane2 ref1=new CargoPlane2();
        ref1.takeoff();
        ref1.fly();
        

        Aeroplane2 ref2=new PassengerPlane2();
        ref2.takeoff();
        ref2.fly();


        Aeroplane2 ref3=new FighterPlane2();
        ref3.takeoff();
        ref3.fly();


        
        
        
       
    }
}

