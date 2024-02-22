package factorymethod.model;

public sealed class Dog implements Animal permits Malamute, Maltese, WelshCorgi {

    @Override
    public String name() {
        return "개";
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
