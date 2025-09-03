class student{
    int age;
    String name;

    public void show(){
        System.out.println(name + " " + age);
    }
}







public class Encapsulation {
    public static void main(String[] args) {
         student obj=new student();
         obj.show();
    }
}
