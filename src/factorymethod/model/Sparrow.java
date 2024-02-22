package factorymethod.model;

public final class Sparrow extends Bird{
    @Override
    public String name() {
        return "참새";
    }

    @Override
    public String move() {
        return "날다";
    }

    @Override
    public String sound() {
        return "짹짹";
    }
}
