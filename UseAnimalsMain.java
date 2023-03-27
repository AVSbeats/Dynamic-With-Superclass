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

        System.out.println();

        System.out.print(theSnake.getName() + "Says ");
        theSnake.speaks();
        System.out.print(theSheep.getName() + "Says ");
        theSheep.speaks();
        System.out.print(theCat.getName() + "Says ");
        theCat.speaks();
        System.out.print(theCow.getName() + "Says ");
        theCow.speaks();
        System.out.print(theDog.getName() + "Says ");
        theDog.speaks();

        System.out.println();

    }
}