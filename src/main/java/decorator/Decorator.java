package decorator;

public abstract class Decorator implements Person {
    private final Person p;

    public Decorator(Person p) {
        this.p = p;
    }

    public Person getPerson(){
        return p;
    }
}
