class Animal{
    int legs;
    String sound;

    void sleep()
    {
        legs=4;
        sound="roar";
        System.out.println("Animal need sleep");
        System.out.println(legs);
    }
}
class Tiger extends Animal{
    void disp()
    {
        System.out.println("Makes sound: " + sound);
    }
}

public class InheritenceTypes {
    public static void main(String[] args) {
        Tiger T1=new Tiger();
        T1.sleep();
        T1.disp();
    }
}
