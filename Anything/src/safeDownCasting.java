public class safeDownCasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        
        if (myAnimal instanceof Dog dog) {
            //Dog myDog = (Dog) myAnimal;
            dog.bark();
        } else {
            System.out.println("Cannot cast myAnimal to Dog.");
        }
    }
}