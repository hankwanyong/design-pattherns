package factorymethod.model;

public final class WelshCorgi extends Dog{
    @Override
    public String name() {
        return "웰시 코기";
    }

    @Override
    public String move() {
        return "달린다";
    }

    @Override
    public String sound() {
        return "멍멍";
    }
}
