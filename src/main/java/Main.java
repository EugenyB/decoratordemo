import decorator.*;

public class Main {
    public static void main(String[] args) {
        Person p = new Artist(new Student());
        p.print();

        Person d = new Dancer(new Student());
        d.print();

        Person dp = new Dancer(new Artist(new Student()));
        dp.print();
    }
}
