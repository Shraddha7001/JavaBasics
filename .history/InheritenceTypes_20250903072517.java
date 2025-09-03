//Singlelevel Inheritence
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

//Multilevel Inheritence
class Demo1{
    void disp()
    {
        System.out.println("disp written in Demo1 class");
    }
}
class Demo2 extends Demo1{
    void disp2()
    {
        System.out.println("disp2 written in Demo2 class");
    }
}
class Demo3 extends Demo2{

}


public class InheritenceTypes {
    public static void main(String[] args) {


        Tiger T1=new Tiger();
        T1.sleep();
        T1.disp();


        Demo3 d3=new Demo3();
        d3.disp();
        d3.disp2();
    }
}
