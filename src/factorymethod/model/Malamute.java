package factorymethod.model;

public final class Malamute extends Dog{
    @Override
    public String name() {
        return "말라뮤트";
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
