package Decorator;

abstract public class Decorator implements IComponent {
    IComponent wrappee; // 원본 객체를 composition
    Decorator(IComponent component) {
        this.wrappee = component;
    }

    public void operation() {
        wrappee.operation(); // 위임
    }
}
