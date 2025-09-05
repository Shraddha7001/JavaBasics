interface car{
    void drive(int avg);
    
}
interface car2{
    void drive2(int avg1, int ts);
}







public class Lambda {
    public static void main(String[] args) {

        car obj=avg -> System.out.println("Driving...." + avg);
        obj.drive(16);

        car2 obj1=(avg1,ts) -> System.out.println("Driving..." + avg1 + ":" + ts );
        obj1.drive2(20,140);

    }
}
