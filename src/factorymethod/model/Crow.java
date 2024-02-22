package factorymethod.model;

public final class Crow extends Bird{
    @Override
    public String name() {
        return "까마귀";
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
