package decorator;

public interface Person {
    void printAbility();

    default void print() {
        printAbility();
        System.out.println();
    }

}
