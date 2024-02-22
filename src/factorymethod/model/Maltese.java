package factorymethod.model;

public final class Maltese extends Dog{
    @Override
    public String name() {
        return "말티즈";
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
