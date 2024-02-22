package factorymethod.model;

public sealed class Bird implements Animal permits Crow, Eagle, Sparrow {

    @Override
    public String name() {
        return "새";
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
