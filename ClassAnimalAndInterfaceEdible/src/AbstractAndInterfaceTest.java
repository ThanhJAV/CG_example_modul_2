import edible.Edible;
import fruit.Fruit;
import fruit.Orange;
import fruit.Apple;
public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        ClassAnimal[] animals = new ClassAnimal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (ClassAnimal animal: animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());
            }
        }
//        for (int animal = 0; animal < animals.length ; animal++){
//            System.out.println(animal.makeSound());
//        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }


    }
}
