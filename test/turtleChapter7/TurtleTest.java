package turtleChapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    
    Turtle turtleIcon = new Turtle();
    @Test
    public void setUp(){
        turtleIcon = new Turtle();
    }

    @Test
    public void turtleIsCreated_theTurtleIsUpTest(){
        assertTrue(turtleIcon.isUp());
    }

    @Test
    public void turtleIsCreated_turtleIsUp_moveTurtleDown_turtleIsDownTest(){
        assertTrue(turtleIcon.isUp());

        turtleIcon.moveDown();

        assertTrue(turtleIcon.isDown());
        assertFalse(turtleIcon.isUp());
    }

    @Test
    public void turtleIsUp_turtleIsDown_turtleFacesEastTest(){
        assertTrue(turtleIcon.isUp());
        turtleIcon.moveDown();
        assertTrue(turtleIcon.isDown());
        assertFalse(turtleIcon.isUp());

        assertEquals(Direction.EAST, turtleIcon.getCurrentDirection());

    }

    @Test
    public void moveturtleDown_turtleMovesRight_turtleFaceSouthTest(){

        turtleIcon.moveDown();

        turtleIcon.turnRight();

        assertEquals(Direction.SOUTH, turtleIcon.getCurrentDirection());

    }

    @Test
    public void moveturtleDown_turtleMovesRight2times_turtleDirectionIsWestTest(){

        turtleIcon.moveDown();

        turtleIcon.turnRight();
        assertEquals(Direction.SOUTH, turtleIcon.getCurrentDirection());

        turtleIcon.turnRight();
        assertEquals(Direction.WEST, turtleIcon.getCurrentDirection());

    }

    @Test
    public void moveturtleDown_turtleMovesRight3times_turtleDirectionIsNorthTest(){

        turtleIcon.moveDown();

        turtleIcon.turnRight();
        assertEquals(Direction.SOUTH, turtleIcon.getCurrentDirection());

        turtleIcon.turnRight();
        assertEquals(Direction.WEST, turtleIcon.getCurrentDirection());

        turtleIcon.turnRight();
        assertEquals(Direction.NORTH, turtleIcon.getCurrentDirection());

    }

    @Test
    public void moveturtleDown_turtleMovesRight4times_turtleDirectionIsEastTest(){

        turtleIcon.moveDown();

        turtleIcon.turnRight();
        assertEquals(Direction.SOUTH, turtleIcon.getCurrentDirection());

        turtleIcon.turnRight();
        assertEquals(Direction.WEST, turtleIcon.getCurrentDirection());

        turtleIcon.turnRight();
        assertEquals(Direction.NORTH, turtleIcon.getCurrentDirection());

        turtleIcon.turnRight();
        assertEquals(Direction.EAST, turtleIcon.getCurrentDirection());

    }


    @Test
    public void moveturtleDown_turtleMovesLeft4times_turtleDirectionIsEastTest(){

        turtleIcon.moveDown();
        assertEquals(Direction.EAST, turtleIcon.getCurrentDirection());

        turtleIcon.turnLeft();
        assertEquals(Direction.NORTH, turtleIcon.getCurrentDirection());

        turtleIcon.turnLeft();
        assertEquals(Direction.WEST, turtleIcon.getCurrentDirection());

        turtleIcon.turnLeft();
        assertEquals(Direction.SOUTH, turtleIcon.getCurrentDirection());

        turtleIcon.turnLeft();
        assertEquals(Direction.EAST, turtleIcon.getCurrentDirection());

    }

    @Test
    public void moveTutleDown_moveTurtle1StepForward_positionIs1Test(){
        turtleIcon.moveDown();

        turtleIcon.moveForward(1);
        assertEquals(Direction.EAST, turtleIcon.getCurrentDirection());
//        assertEquals( turtleIcon.getPosition());

    }
}
