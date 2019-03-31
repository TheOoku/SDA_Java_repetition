package Day01.Ex1;

public class NameDigitalisation {

    int[] lettersToDigits(String name) {
        name = name.toLowerCase();
        char[] letterArray = name.toCharArray();
        int[] digitsArray = new int[name.length()];

        for (int i = 0; i < letterArray.length; i++) {
            // konwersja diakrytyków na ogólne
            switch (letterArray[i]){
                case 'ą': letterArray[i] = 'a';
                break;
                case 'ć': letterArray[i] = 'c';
                break;
                case 'ę': letterArray[i] = 'e';
                break;
                case 'ł': letterArray[i] = 'l';
                break;
                case 'ń': letterArray[i] = 'n';
                break;
                case 'ó': letterArray[i] = 'o';
                break;
                case 'ż': letterArray[i] = 'z';
                break;
                case 'ź': letterArray[i] = 'z';
                break;
            }
            //System.out.println(letterArray[i]);

            /* można na if'ach
            if (letterArray[i] == 'ą'){
                letterArray[i] = 'a';
            } else if (letterArray[i] == 'ć'){
                letterArray[i]
            }
            */
        }

        for (int i = 0; i < digitsArray.length; i++) {
            if (letterArray[i] == ' '){
                digitsArray[i] = 0;
            } else {
                int d = letterArray[i] - 96;    // a = 97, więc odejmujemy od niego 96 i mamy 1 (liczbę w kolejności)
                digitsArray[i] = d;
            }
        }

        for (int i = 0; i < letterArray.length; i++) {
            System.out.print("Litera: " + letterArray[i] + " ma wartość: " + digitsArray[i] + "\n");
        }

        return digitsArray;
    }
}
