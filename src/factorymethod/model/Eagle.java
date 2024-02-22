package factorymethod.model;

public final class Eagle extends Bird{
    @Override
    public String name() {
        return "독수리";
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
