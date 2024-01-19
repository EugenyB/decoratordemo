package decorator;

public class Student implements Person {
    @Override
    public void printAbility() {
        System.out.print("I can study. ");
    }
}
