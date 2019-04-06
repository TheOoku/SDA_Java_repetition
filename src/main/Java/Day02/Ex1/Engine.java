package Day02.Ex1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Engine {

    @Deprecated
    int getBirthDate(String pesel){
        char[] peselChar = pesel.toCharArray();
        int[] peselInt = new int[6];
        int currentYear = 2019;

        for (int i = 0; i < 6; i++) {
            peselInt[i] = peselChar[i];
        }

        int yearOfBirth = 1900 + peselInt[0] * 10 + peselInt[1];
        int daysFromYear = (currentYear - yearOfBirth);

        return 0;
    }

    LocalDate getDateFromPesel(String pesel){
        char[] peselChar = pesel.toCharArray();
        StringBuilder dateOfBirth = new StringBuilder("19");

        for (int i = 0; i < 6; i++) {
            dateOfBirth.append(peselChar[i]);

            if (i == 1 || i == 3){
                dateOfBirth.append("-");    // date format yy-MM-dd
            }
        }

        //System.out.println(dateOfBirth);

        //String dateFromPesel = "1992-07-13";
        LocalDate date = LocalDate.parse(dateOfBirth);
        //System.out.println(date);

        return  date;
    }

    long getDaysTillNow(LocalDate dateOfBirth){
        LocalDate dateNow = LocalDate.now();

        long nbOfDays = ChronoUnit.DAYS.between(dateOfBirth, dateNow);

        return nbOfDays;
    }

    int getModulo(long numberOfDaysBetween) {
        int modulo = (int) numberOfDaysBetween % 2;
        return modulo;
    }
}
