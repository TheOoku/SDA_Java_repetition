package Day02.Ex1_alt;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String pesel = new String("92071314764");
        LocalDate dateNow = LocalDate.now();
        Person person = new Person(pesel);

        int modulo = getModulo(person.getDaysTillNow(person.calculatedDateOfBirth, dateNow));
        System.out.println("Modulo z przeżytych dni wynosi: " + modulo);
    }

    private static int getModulo(long numberOfDaysBetween) {
        int modulo = (int) numberOfDaysBetween % 2;
        return modulo;
    }


}
