package Day01.Ex3;

// klasa do obsługi (sterowania) funkcjonalnością
public class Engine {
    static int[] triangleSides = new int[2];
    static double circumference;

    public static void main(String[] args) {
        // if blokuje wywołanie scannera pobierającego wartości, w celu przepuszczenia nastaw testowych
        if (triangleSides[0] == 0 || triangleSides [1] == 0) {
            LengthScanner.lengthScanning();
        }

        TriangleLogic triangleLogic = new TriangleLogic();
        // obliczenie przeciwprostokątnej za pomocą metody z kl. TriangleLogic
        double hypotenus = triangleLogic.triangleHypotenus(triangleSides[0], triangleSides[1]);
        System.out.println("Przeciwprostokątna wynosi: " + hypotenus);

        triangleLogic.triangleCircumference(hypotenus);
        System.out.println("Obwód trójkąta wynosi: " + circumference);

        // wartość można wyświetlić "w locie" bez zapisu do zmiennej, ale wówczas nie zachowujemy jej do ew. dalszych operacji
        System.out.println("Wartość pola powierzchni trójkąta wynosi: " +
                triangleLogic.triangleField());

        triangleLogic.triangleDraw();
    }

}
