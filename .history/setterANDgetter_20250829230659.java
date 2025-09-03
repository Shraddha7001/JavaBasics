class student{
    private int age;
    private String name;




    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name + " " + age);
    }
}



public class setterANDgetter {
    public static void main(String[] args) {
        student obj1=new student();
        student obj2=new student();
        obj1.setAge(21);
        obj1.setAge(21);
        obj2.setName("Kittu");
        obj2.setName("Billu");
        obj1.show();
        obj2.show();

    }
}
