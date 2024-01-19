package decorator;

public class Artist extends Decorator {
    public Artist(Person p) {
        super(p);
    }

    @Override
    public void printAbility() {
        getPerson().printAbility();
        paintAbility();
    }

    private void paintAbility() {
        System.out.print("I can paint. ");
    }
}
