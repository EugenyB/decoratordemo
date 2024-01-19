package decorator;

public class Dancer extends Decorator {
    public Dancer(Person p) {
        super(p);
    }

    @Override
    public void printAbility() {
        getPerson().printAbility();
        danceAbility();
    }

    private void danceAbility() {
        System.out.print("I can dance. ");
    }
}
