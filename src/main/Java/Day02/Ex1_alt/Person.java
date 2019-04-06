package Day02.Ex1_alt;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    String pesel;
    LocalDate calculatedDateOfBirth;

    public String getPesel() {
        return pesel;
    }

    public LocalDate getCalculatedDateOfBirth() {
        return calculatedDateOfBirth;
    }

    public Person(String pesel) {
        this.pesel = pesel;
        getBirthFromPesel(pesel);
    }

    private void getBirthFromPesel(String pesel) {
        char[] peselChar = pesel.toCharArray();
        StringBuilder dateOfBirth = new StringBuilder();
        // j. ktoś urodził się po 2000 to 3 cyfra PESEL będzie "2"
        if (peselChar[2] == '2'){
            dateOfBirth.append("20");
        } else {
            dateOfBirth.append("19");
        }

        for (int i = 0; i < 6; i++) {
            dateOfBirth.append(peselChar[i]);

            if (i == 1 || i == 3){
                dateOfBirth.append("-");    // date format yyyy-MM-dd
            }
        }

        calculatedDateOfBirth = LocalDate.parse(dateOfBirth);
    }

    long getDaysTillNow(LocalDate dateOfBirth, LocalDate dateNow){

        long nbOfDays = ChronoUnit.DAYS.between(dateOfBirth, dateNow);

        return nbOfDays;
    }

}
