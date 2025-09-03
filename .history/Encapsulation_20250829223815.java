class student{
    int age;
    String name;
    private int age1;
    private String name1;

    public void show(){
        System.out.println(name + " " + age);
    }

    public void setData(){
        age1=21;
        name1="Kittu";
    }
    public void show1(){
        System.out.println(name1 + " " + age1);
    }
}







public class Encapsulation {
    public static void main(String[] args) {
         student obj=new student();
         obj.age=21;
         obj.name="Billu";
         obj.setData();
         obj.show1();
         obj.show();
    }
}
