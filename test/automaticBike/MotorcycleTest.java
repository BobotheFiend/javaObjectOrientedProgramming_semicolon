package automaticBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {

    Motorcycle myKawasaki;
    @BeforeEach
    public void setUp() {
        //Given
        myKawasaki = new Motorcycle();
        myKawasaki.turnsOn();
    }

    @Test
    public void motorcycleIsOff_turnOnMotorcycleTest(){
        //When myKawasaki turns on

        //Check that
        assertTrue(myKawasaki.getButtonState());
    }

    @Test
    public void myMotorcycleIsOn_turnOffTheMotorcycle_motorCycleTurnsOffTest(){

        //When
        myKawasaki.turnsOff();

        //Check that
        assertFalse(myKawasaki.getButtonState());
    }

    @Test
    public void motorcycleIsOn_accelerateTheMotorcycle_speedIncreaseTest(){
        //When
        myKawasaki.accelerates();

        //Check that
        assertEquals(1, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOn_accelerateTheMotorcycleTwice_speedometerIncreasesBy2Test(){
        //When
        myKawasaki.accelerates();
        myKawasaki.accelerates();

        //Check that
        assertEquals(2, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOn_accelerateTheMotorcycle15Times_speedometerIncreasesBy15Test(){
        //When
        acceleratorCount(15);

        //Check that
        assertEquals(15, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOn_accelerateTheMotorcycleTwice_deceleratesTheMotorcycleOnce_speedometerIs1Test(){
        //given
        myKawasaki.accelerates();
        myKawasaki.accelerates();

        //when
        myKawasaki.decelerates();

        //Check that
        assertEquals(1, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOn_accelerateTheMotorcycleFiveTimes_deceleratesTheMotorcycleTwice_speedometerIs3Test(){
        //given
        acceleratorCount(5);

        //when
        myKawasaki.decelerates();
        myKawasaki.decelerates();


        //Check that
        assertEquals(3, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOn_accelerateTheMotorcycleOnce_deceleratesTheMotorcycleTwice_speedometerIs0Test(){
        //given
        myKawasaki.accelerates();

        //When
        myKawasaki.decelerates();
        myKawasaki.decelerates();

        //check that
        assertEquals(0, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOnSpeedometerOn24_accelerateMotorcycleOnce_speedometerIs26Test(){
        //Given
        acceleratorCount(26);
        myKawasaki.decelerates();
        myKawasaki.decelerates();
        myKawasaki.decelerates();

        //When
        myKawasaki.accelerates();

        //Check that gear switches
        assertEquals(26, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOnSpeedometerOn21_accelerateMotorcycleTwice_speedometerIs25Test(){
        //Given
        acceleratorCount(21);

        //When
        myKawasaki.accelerates();
        myKawasaki.accelerates();

        //Check that gear switches
        assertEquals(25, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOnSpeedometerOn25_dcelerateMotorcycle_speedometerIs23Test(){
        //Given
        acceleratorCount(23);

        //When
        myKawasaki.decelerates();

        //Check that
        assertEquals(23, myKawasaki.getSpeed());

    }

    @Test
    public void motorcycleIsOnSpeedometerOn35_accelerateMotorcycleTwice_speedometerIs38Test(){
        //Given
        acceleratorCount(26);
        myKawasaki.decelerates();
        acceleratorCount(3);
        //When
        myKawasaki.accelerates();

        //Check that
        assertEquals(38, myKawasaki.getSpeed());

    }

    @Test
    public void motorcycleIsOnAndSpeedometerOn44_accelerateMotorcycleOnce_speedometerIs34Test(){
        //Given
        acceleratorCount(28);
        myKawasaki.decelerates();
        myKawasaki.decelerates();
//        acceleratorCount(3);
        //When
//        myKawasaki.accelerates();

        //Check that
        assertEquals(46, myKawasaki.getSpeed());

    }

    @Test
    public void motorcycleIsOnAndSpeedometerOn31_accelerateMotorcycleTwice_speedometerIs34Test(){
        //Given
        acceleratorCount(31);

        //When
        myKawasaki.accelerates();
        myKawasaki.accelerates();

        //Check that
        assertEquals(37, myKawasaki.getSpeed());

    }

    @Test
    public void motorcycleisOnAndSpeedometerIs37_myKawasakiDecelerateInGear3Once_SpeedometerIs34Test(){
        //Given
        acceleratorCount(37);


        //When
        myKawasaki.decelerates();

        //Check that
        assertEquals(34, myKawasaki.getSpeed());
    }


    @Test
    public void motorcycleisOnAndSpeedometerIs40_myKawasakiDecelerateInGear3Twice_SpeedometerIs31Test(){
        //Given
        acceleratorCount(40);

        //When
        myKawasaki.decelerates();
        myKawasaki.decelerates();

        //Check that
        assertEquals(34, myKawasaki.getSpeed());
    }


    @Test
    public void motorcycleisOnAndSpeedometerIs41_myKawasakiAcceleratesOnceAndShiftsToGear4_speedometerIs45Test(){

        //Given
        acceleratorCount(41);

        //When
        myKawasaki.accelerates();

        //Check That
        assertEquals(45, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOnTheSpeedIs44_myKawasakiAccelerates_speedometerIs48Test(){
        //Given
        acceleratorCount(44);

        //When
        myKawasaki.accelerates();

        //Check that
        assertEquals(48, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOnTheSpeedIs44_myKawasakiAcceleratesTwice_speedometerIs52Test(){
        //Given
        acceleratorCount(44);

        //When
        myKawasaki.accelerates();
        myKawasaki.accelerates();

        //Check that
        assertEquals(52, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOnTheSpeedIs44_myKawasakisdDecelerates_speedometerIs48Test(){
        //Given
        acceleratorCount(31);

        //When
//        myKawasaki.decelerates();

        //Check that
        assertEquals(48, myKawasaki.getSpeed());
    }

    @Test
    public void motorcycleIsOnTheSpeedIs50_myKawasakisdDeceleratesTwice_speedometerIs42Test() {
        //Given
        acceleratorCount(23);

        //When
        myKawasaki.decelerates();
        myKawasaki.decelerates();

        //Check that
        assertEquals(42, myKawasaki.getSpeed());
    }
        public void acceleratorCount(int speed){
            if (myKawasaki.getButtonState() == true) {
                for(int count = 0; count < speed; count++ ){
                    myKawasaki.accelerates();
                }
            }
        }

    }