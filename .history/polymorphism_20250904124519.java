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
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    //Specialization
    public void CarryGoods()
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends Aeroplane{
    //Overriding
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    //Specialization
    public void CarryGoods()
    {
        System.out.println("PassengerPlane carries passenger");
    }
}













public class polymorphism {
    public static void main(String[] args) {
        


        CargoPlane cp=new CargoPlane();
        

        PassengerPlane pp=new PassengerPlane();


        Aeroplane ref;
        ref=cp;
        ref=pp;


        ref.takeoff();
        ref.fly();
    }
}

