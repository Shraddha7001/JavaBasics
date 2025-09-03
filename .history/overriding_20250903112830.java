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
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void CarryGoods()
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends Aeroplane{
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void CarryGoods()
    {
        System.out.println("PassengerPlane carries passenger");
    }
}













public class overriding {
    public static void main(String[] args) {
        


        CargoPlane cp=new CargoPlane();
        cp.takeoff();
        cp.fly();


        PassengerPlane pp=new PassengerPlane();
        pp.takeoff();
        pp.fly();
    }
}
