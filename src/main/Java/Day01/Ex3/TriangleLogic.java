package Day01.Ex3;

import static Day01.Ex3.Engine.circumference;
import static Day01.Ex3.Engine.triangleSides;
import static java.lang.Math.sqrt;

// na podstawie otrzymanych boków trójkąta wykonuje obliczenia
public class TriangleLogic {

    // podaje długość przeciwprostokątnej
    double triangleHypotenus(int a, int b){
        // pierwszy sposób przez bezpośrednie odwołanie do tablicy statycznej
        //double c = sqrt((triangleSides[0] * triangleSides[0]) + (triangleSides[1] * triangleSides[1]));

        // drugi sposób przez przekazanie do metody wartości
        double c = sqrt((a * a) + (b * b));

        return c;
    }

    // podaje obwód trójkąta
    void triangleCircumference(double c){
        // ustawia wartość zmiennej circumference w instancji klasy Engine (dzięki czemu met. może być void)
        circumference = triangleSides[0] + triangleSides[1] + c;
    }

    // podaje pole trójkąta
    double triangleField(){
        // wartości boków rzutowane do zmiennoprzecinkowych, bo wartość pola nie musi być całkowita (i dla pokazania rzutowania)
        double a = (double) triangleSides[0];
        double b = (double) triangleSides[1];

        // można zwrócić wartość też bez zmiennej "pośredniczącej"
        return ((a * b) / 2);
    }

    // extra feture: "rysowanie" trójkąta w konsoli, jednym znakiem
    void triangleDraw(){
        if (triangleSides[0] == triangleSides[1]) {
            for (int i = 1; i <= triangleSides[0]; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("$");
                }
                System.out.println();
            }
        } else {
            System.out.println("Obecnie wygląda i działa dobrze tylko dla trójkątów o równych przyprostokątnych, sorry :)");
        }
    }
}
