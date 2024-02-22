package factorymethod.factory;

import factorymethod.AnimalSize;
import factorymethod.model.Animal;

public interface Pet {
    Animal create(AnimalSize size);

}
