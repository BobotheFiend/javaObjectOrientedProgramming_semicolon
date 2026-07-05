package person;

import org.junit.jupiter.api.Test;

import static javax.swing.SwingConstants.SOUTH_EAST;
import static javax.swing.SwingConstants.SOUTH_WEST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class NigerianTest {


    @Test
    public void askPersonForState_checkThatTheCorrectGeoZoneIsGivenTest(){
        Nigerian personOne = new Nigerian("Musa","Abuja", "male");
        assertEquals("NORTH_CENTRAL",personOne.getGeoZone());
    }

    @Test
    public void askPersonTwoForState_checkThatTheCorrectGeoZoneIsGivenTest(){
        Nigerian personTwo =  new Nigerian("Sharon", "Abia", "male");
        assertSame("SOUTH_EAST", personTwo.getGeoZone());
    }

    @Test
    public void askPersonThreeForState_checkThatTheCorrectGeoZoneIsGivenTest(){
        Nigerian personThree =  new Nigerian("Cecilia", "Akwa_IBom", "Female");
        assertSame("SOUTH_SOUTH", personThree.getGeoZone());
    }
}

