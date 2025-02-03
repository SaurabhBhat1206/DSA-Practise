package practise;

public class Inheritance extends Object{
    public static void main(String args[]){
        Business business = Business.getInstance();
        Business business1 = Business.getInstance();
        Business business2 = Business.getInstance();
        Business business3 = Business.getInstance();
        System.out.println(business.hashCode());
        System.out.println(business1.hashCode());
        System.out.println(business2.hashCode());
        System.out.println(business3.hashCode());
    }
}

class Animal extends Shape{
    void eat(){System.out.println("eating...");}

    @Override
    void draw() {
        System.out.println("drawing");
    }
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
abstract class Shape{
    abstract void draw();
}