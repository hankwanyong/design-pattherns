package factorymethod;

import factorymethod.factory.BirdPet;
import factorymethod.factory.DogPet;
import factorymethod.factory.Pet;
import java.util.Arrays;

public class FactoryMethodMain {

    public static void main(String... args) {

        Pet dogFactory = new DogPet();
        Pet birdFactory = new BirdPet();

        var animalSize = AnimalSize.values();
        Arrays.stream(animalSize).forEach(size -> {
            System.out.println("size : " + size.name());
            dogFactory.create(size).introduce();
            birdFactory.create(size).introduce();
        });

    }
}
