public class Runner {

    public static void main(String[] args){
        Cat myCat = new Cat("Mimi", 3);
        System.out.println(myCat.meow());
        myCat.setAge(2); // if the age is not reset, it will show 0.
        System.out.println(myCat.getAge());
    }
}
