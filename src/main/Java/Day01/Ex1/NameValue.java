package Day01.Ex1;

public class NameValue {
    int calculateNameValue (int[] digitsArray){
        int sume = 0;
        for (int i = 0; i < digitsArray.length; i++){
            sume += digitsArray[i];
        }

        return sume;
    }
}
