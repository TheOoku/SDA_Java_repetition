package Day01.Ex1;

public class Engine {

    public int nameModulo (String name){
        //String name = "Jan Ul";

        NameDigitalisation nameDigitalisation = new NameDigitalisation();
        int[] digitsArray = nameDigitalisation.lettersToDigits(name);

        NameValue nameValue = new NameValue();
        int nameSume = nameValue.calculateNameValue(digitsArray);

        int nameMod = nameSume % 2;

        //System.out.println("Wartość liczbowa imienia i nazwiska to: " + nameSume);
        //System.out.println("Modulo 2 dla tej sumy wynosi: " + nameMod);

        return nameMod;
    }
}
