package turtleChapter7;

import turtleChapter7.Direction;

import static turtleChapter7.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private Direction currentDirection = EAST;
    private TurtlePosition position = new TurtlePosition();


    public boolean isUp() {
        return penIsUp;
    }

    public void moveDown() {
        this.penIsUp = false;
    }

    public boolean isDown() {
        return !penIsUp;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {

        switch (currentDirection) {

            case NORTH -> currentDirection = EAST;
            case EAST -> currentDirection = SOUTH;
            case  SOUTH -> currentDirection = WEST;
            case  WEST -> currentDirection = NORTH;
        }

    }

    public void turnLeft() {
        switch (currentDirection) {

            case NORTH -> currentDirection = WEST;
            case EAST -> currentDirection = NORTH;
            case  SOUTH -> currentDirection = EAST;
            case  WEST -> currentDirection = SOUTH;
        }
    }

    public void moveForward(int step) {
        switch (currentDirection) {

            case NORTH -> position.increaseRowBy(step);
            case  EAST -> position.increaseColumnBy(step);
            case  SOUTH -> position.increaseRowBy(step);
            case  WEST -> position.increaseColumnBy(step);
        }
    }

    public TurtlePosition getPosition(){
        return position;
    }
}
