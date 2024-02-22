package factorymethod.model;

public sealed interface Animal permits Dog, Bird {
    String name();
    String move();
    String sound();

    default void introduce() {
        System.out.println(name()+"는" + "`" + move() + "`로 움직이고 소리는 " +sound());
    }
}
