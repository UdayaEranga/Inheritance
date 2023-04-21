public class Animal {
    void eat(){
        System.out.println("Eating!");
    }
}
class dog extends Animal {
    void bark(){
        System.out.println("Baw Baw!");
    }
}
class TestInheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
}