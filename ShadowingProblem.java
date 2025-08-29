class student{
    private int age;
    private String name;

    public void setData1(int age){
        this.age=age;
    }
    public void setData2(String name){
        this.name=name;
    }
    public void show(){
    System.out.println(name + " " + age);
    }
}



public class ShadowingProblem {
    public static void main(String[] args) {
        student obj1=new student();
        student obj2=new student();
        obj1.setData1(21);
        obj2.setData1(21);
        obj1.setData2("Billu");
        obj2.setData2("Kittu");
        obj1.show();
        obj2.show();
    }
}
