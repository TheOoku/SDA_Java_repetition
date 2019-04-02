package Day01.Ex3;

import java.util.Scanner;

import static Day01.Ex3.Engine.triangleSides;

// pobiera od użytkownika długości boków trójkąta
public class LengthScanner {
    public static void lengthScanning(){
        // poniższe dwie linie pozostały z wcześniejszej wersji
        // przy okazji pokazują ustawianie wartości statycznej tablicy w jednym obiekcie, z innego obiektu
        triangleSides[0] = 3;
        triangleSides[1] = 4;

        //pobieranie przyprostokątnych od użytkownika za pomocą scannera
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wrowadź wartość (tylko liczby całkowite) pierwszej przyprostokątnej: ");
        triangleSides[0] = scanner.nextInt();
        System.out.print("Wrowadź wartość (tylko liczby całkowite) drugiej przyprostokątnej: ");
        triangleSides[1] = scanner.nextInt();
        scanner.close();    // ponieważ więcej go nie używamy, to można zamknąć

    }
}
