public class Cat {

    private int age;
    private String name;

//    constructor name should match class name
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        //similar to ruby @name, @age
    }

    public String meow(){
        return "Meooooowww";
    }

//    getter method
    public int getAge(){
        return this.age; //this is not necessary
    }
//    setter method
    public void setAge(int age){
        this.age = age;
    }
}
