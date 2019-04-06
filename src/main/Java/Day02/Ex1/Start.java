package Day02.Ex1;

import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        Person person = new Person("92071314764");
        Engine engine = new Engine();

        LocalDate dateOfBirth = engine.getDateFromPesel(person.getPesel());
        System.out.println(dateOfBirth);

        long numberOfDaysBetween = engine.getDaysTillNow(dateOfBirth);
        System.out.println(numberOfDaysBetween);

        int modulo = engine.getModulo(numberOfDaysBetween);
    }
}
