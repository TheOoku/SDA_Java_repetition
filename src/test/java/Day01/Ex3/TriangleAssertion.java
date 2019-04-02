package Day01.Ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Day01.Ex3.Engine.circumference;
import static Day01.Ex3.Engine.triangleSides;

public class TriangleAssertion {

    // to zadanie nie zostało napisane zbyt fortunnie pod testy, przyznaję

    @Test
    public void equalSidesTriangleTest(){
        // given
        Engine engine = new Engine();
        TriangleLogic triangleLogic = new TriangleLogic();
        triangleSides[0] = 3;
        triangleSides[1] = 3;
        double expectedHypotenus = 4.242640687119285;
        double expectedCircum = 10.242640687119284;
        double expectedField = 4.5;

        // when
        double actualHypotenus = triangleLogic.triangleHypotenus(triangleSides[0], triangleSides[1]);
        triangleLogic.triangleCircumference(actualHypotenus);   //metoda ustawia statyczną zmienną "circumference", z kl. Engine
        double actualField = triangleLogic.triangleField();

        // then
        Assertions.assertEquals(expectedHypotenus, actualHypotenus);
        Assertions.assertEquals(expectedCircum, circumference);
        Assertions.assertEquals(expectedField, actualField);
    }
}
