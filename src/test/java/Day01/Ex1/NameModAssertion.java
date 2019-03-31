package Day01.Ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.*;

public class NameModAssertion {

    @Test
    public void janNametest(){
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
    public void hubertNametest(){
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
    public void ilonaNametest(){
        //given
        String testName = "Ilona Baran";
        Engine engine = new Engine();
        int expValue = 1;

        //when
        int actualValue = engine.nameModulo(testName);

        //then
        Assertions.assertEquals(expValue, actualValue);
    }
}
