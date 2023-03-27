public class UseAnimalsMain {
    public static void main(String[] args) {

        Snake theSnake = new Snake();
        Sheep theSheep = new Sheep();
        Dog theDog = new Dog();
        Cat theCat = new Cat();
        Cow theCow = new Cow();

        theSnake.setName("The Snake ");
        theSheep.setName("The Sheep ");
        theDog.setName("The Dog ");
        theCat.setName("The Cat ");
        theCow.setName("The Cow ");

        talkingAnimal(theSnake);
        talkingAnimal(theSheep);
        talkingAnimal(theDog);
        talkingAnimal(theCat);
        talkingAnimal(theCow);

    }

    public static void talkingAnimal(Animal animal) {

        System.out.println();

        System.out.print(animal.getName() + "Says ");
        animal.speaks();

    }
}