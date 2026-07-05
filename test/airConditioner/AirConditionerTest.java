package airConditioner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    AirConditioner splitUnit;
    @BeforeEach
    public void setUp(){
        //Given
        splitUnit = new AirConditioner();
        splitUnit.switchOn();
    }

    @Test
    public void splitUnitIsOff_switchOnSplitUnitTest(){
        assertTrue(splitUnit.getPowerState());
    }

    @Test
    public void splitUnitIsOnSwitchItOff_splitUnitSwitchesOffTest(){
        splitUnit.switchOff();
        assertFalse(splitUnit.getPowerState());
    }

    @Test
    public void splitUnitIsOn_increaseTemperature_temperatureIncreasesTest(){
        assertTrue(splitUnit.getPowerState());
        splitUnit.setTemperatureToHigh();
        assertEquals(21, splitUnit.getTemperature());
    }

    @Test
    public void splitUnitIsOn_increaseTemperatureMultipleTimes_temperatureIncreasesTest(){
        //Given
        assertTrue(splitUnit.getPowerState());

        //When
        int amountOfTimesButtonIsPressed = 0;
        while( amountOfTimesButtonIsPressed < 5) {
            splitUnit.setTemperatureToHigh();
            amountOfTimesButtonIsPressed++;
        }
        //assert
        assertEquals(25, splitUnit.getTemperature());
    }

    @Test
    public void splitUnitIsOn_increaseTemperatureMultipleTimes_temperatureDoesNotExceed30Test(){
        //given
        assertTrue(splitUnit.getPowerState());

        //when
        for(int count = 0; count < 20; count++){
            splitUnit.setTemperatureToHigh();
        }

        //assert
        assertEquals(30, splitUnit.getTemperature());
    }

    @Test
    public void theSplitUintIsOn_temperatureIsReducedOnceTest(){
        //Given
        assertTrue(splitUnit.getPowerState());

        //When
        splitUnit.setTemperatureToLow();

        //Assert
        assertEquals(19, splitUnit.getTemperature());

    }

    @Test
    public void theSplitUintIsOn_theRoomGetsHot_temperatureIsReducedTo16Test(){
        //Given
        assertTrue(splitUnit.getPowerState());

        //when
        int reducingTemperatureFourTimes = 0;
        while(reducingTemperatureFourTimes < 4){
            splitUnit.setTemperatureToLow();
            reducingTemperatureFourTimes++;
        }

        //Check that
        assertEquals(16, splitUnit.getTemperature());
    }

    @Test
    public void theSplitUintIsOn_temperatureCannotGetPast16Test(){
        //when
        int reducingTheTemperature = 0;

        while(reducingTheTemperature < 25) {
            splitUnit.setTemperatureToLow();
            reducingTheTemperature++;
        }

        //Check that
        assertEquals(16, splitUnit.getTemperature());
    }
}
