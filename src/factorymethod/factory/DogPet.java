package factorymethod.factory;

import factorymethod.AnimalSize;
import factorymethod.model.Animal;
import factorymethod.model.Malamute;
import factorymethod.model.Maltese;
import factorymethod.model.WelshCorgi;

public class DogPet implements Pet {

    @Override
    public Animal create(AnimalSize size) {
        return switch (size) {
            case SMALL -> new Maltese();
            case MEDIUM -> new WelshCorgi();
            case LARGE -> new Malamute();
        };
    }
}
