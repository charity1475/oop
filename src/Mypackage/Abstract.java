package Mypackage;

public abstract class Abstract {
    public String name;
    public String gender;
    public int age;
    // declaring a constructor

    public Abstract(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void present(){
        System.out.println("My name is " + name);
        System.out.println("I'm "+ gender);
        System.out.println("I'm "+ age + " Years old");
    }

}
