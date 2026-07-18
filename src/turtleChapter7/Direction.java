package turtleChapter7;

public enum Direction {
    EAST("NORTH", "SOUTH"),
    SOUTH("EAST", "WEST"),
    WEST("SOUTH", "NORTH"),
    NORTH("WEST", "EAST");

    String left;
    String right;

    Direction(String left, String right){
        this.left = left;
        this.right = right;
    }

    public Direction getleft(){
        return Direction.valueOf(this.left);
    }

    public Direction getright(){
        return Direction.valueOf(this.right);
    }

//    public Direction valueOf(String value){
//        return Direction;
//    }

//    public Direction [] values(){
//        return Direction.values();
//    }
}
