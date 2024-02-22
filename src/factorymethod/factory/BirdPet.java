package factorymethod.factory;

import factorymethod.AnimalSize;
import factorymethod.model.Animal;
import factorymethod.model.Crow;
import factorymethod.model.Eagle;
import factorymethod.model.Sparrow;

public class BirdPet implements Pet {

    @Override
    public Animal create(AnimalSize size) {
        return switch (size) {
            case SMALL -> new Sparrow();
            case MEDIUM -> new Crow();
            case LARGE -> new Eagle();
        };
    }
}
