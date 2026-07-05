package tasks;

public class RotateNintyDegrees {

    public int [][] getRotatedPositions(int [][] collections){
        int [][] rotatedElements = new int [collections.length][collections[0].length];

        for (int rows = 0; rows < collections.length; rows++){
            int index = collections[0].length - 1;
//            rotatedElements[rows][rows-rows] = collections[rows-rows+1][index];
//            rotatedElements[rows][rows-rows+1] = collections[rows-rows][index++];
            for (int columns = 0; columns < collections[0].length; columns++){
                rotatedElements[rows][columns] = collections[index--][rows];
            }
        }
        return rotatedElements;
    }

    static void main() {
        RotateNintyDegrees rotate = new RotateNintyDegrees();
        int [][] arr = {
                {2,3,4},
                {5,6,5},
                {4,6,5}
        };

        System.out.println(java.util.Arrays.deepToString(rotate.getRotatedPositions(arr)));
    }
}
