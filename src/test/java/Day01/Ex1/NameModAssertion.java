package Day01.Ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.*;

public class NameModAssertion {

    @Test
    public void janNameTest(){
        //given
        String testName = "Jan Ul";
        Engine engine = new Engine();
        int expValue = 0;

        //when
        int actualValue = engine.nameModulo(testName);

        //then
        Assertions.assertEquals(expValue, actualValue);
    }

    @Test
    public void hubertNameTest(){
        //given
        String testName = "Hubert Lisiecki";
        Engine engine = new Engine();
        int expValue = 1;

        //when
        int actualValue = engine.nameModulo(testName);

        //then
        Assertions.assertEquals(expValue, actualValue);
    }

    @Test
    public void martaNameTest(){
        //given
        String testName = "Marta Baran";
        Engine engine = new Engine();
        int expValue = 1;

        //when
        int actualValue = engine.nameModulo(testName);

        //then
        Assertions.assertEquals(expValue, actualValue);
    }
}
